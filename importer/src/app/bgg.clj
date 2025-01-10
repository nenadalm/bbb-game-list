(ns app.bgg
  (:require
   [clojure.java.io :as io]
   [clojure.xml]
   [clojure.string :as str]
   [clojure.math :as m]
   [clojure.edn :as edn]
   [app.url :as url]
   [app.cache :as cache]))

(def ^:private api-root "https://www.boardgamegeek.com/xmlapi2")

(defn- round-10 [x]
  (float (/ (m/round (* 10 x)) 10)))

(defn- search-game-url [name]
  (clojure.java.io/as-url (str api-root
                               "/search?exact=1&type=boardgame&query="
                               (java.net.URLEncoder/encode name))))

(defn- search-game-non-exact-url [name]
  (clojure.java.io/as-url (str api-root
                               "/search?exact=0&type=boardgame&query="
                               (java.net.URLEncoder/encode name))))

(defn- game-details-url [game-id]
  (clojure.java.io/as-url (str api-root
                               "/thing?type=boardgame&stats=1&id="
                               game-id)))

(defn- game-collection-url [username]
  (clojure.java.io/as-url (str api-root
                               "/collection?own=1&username="
                               (java.net.URLEncoder/encode username))))

(defn- game-item->game [game-item]
  (reduce
   (fn [game item]
     (case (:tag item)
       :name (assoc game :name (-> item :attrs :value))
       game))
   {:id (-> game-item :attrs :id)
    :type (-> game-item :attrs :type)}
   (:content game-item)))

(defn- result->games [result]
  (not-empty (mapv game-item->game (:content result))))

(defn- search-game-exact [name]
  (let [url (search-game-url name)]
    (with-open [xin (url/->cached-stream url)]
      (result->games (clojure.xml/parse xin)))))

(defn- search-game-non-exact [name]
  (let [url (search-game-non-exact-url name)]
    (with-open [xin (url/->cached-stream url)]
      (result->games (clojure.xml/parse xin)))))

(defn- name-length [game]
  (count (:name game)))

(defn- remove-duplicates [games]
  (mapv first (vals (group-by :name games))))

(defn- remove-special-chars [name]
  (clojure.string/replace name #"(?U)\W" ""))

(defn- one-game-result [games name]
  (let [games (remove-duplicates games)]
    (if (= 1 (count games))
      games
      (let [name-length* (count name)
            by-name-length (group-by name-length games)
            exact-length (get by-name-length name-length*)
            length-1 (get by-name-length (dec name-length*))
            length+1 (get by-name-length (inc name-length*))]
        (cond
          ;; if there is more matches, we have no idea which is correct
          (< 1 (count exact-length)) nil

          ;; probably some typo or swapped words
          (= 1 (count exact-length)) exact-length

          ;; probably extra dot, comma or something
          (= 1 (count length-1)) length-1

          ;; probably missing colon, bang or something
          (= 1 (count length+1)) length+1

          ;; many mistakes like missing many special characters or excessive special characters
          :else (let [name-without-special-chars (remove-special-chars name)
                      games-without-special-chars (mapv #(update % :name remove-special-chars) games)]
                  (when-not (= games games-without-special-chars)
                    (let [match (first (one-game-result games-without-special-chars name-without-special-chars))
                          id->games (group-by :id games)]
                      (id->games (:id match))))))))))

(defn- some-game-result [games]
  (when (< 0 (count games))
    games))

(def ^:private name-fixers
  [#(clojure.string/replace % " and " " & ")
   #(clojure.string/replace % "’" "'")
   #(clojure.string/replace % ":" "")
   #(clojure.string/replace % "," "")
   #(clojure.string/replace % "!" "")
   #(clojure.string/replace % "–" "")])

(defn- possible-names [name]
  (let [fixed-names (into #{} (map #(% name)) name-fixers)]
    (into [name] (disj fixed-names name))))

(defn- first-result [f names]
  (first
   (into
    []
    (comp
     (keep f)
     (take 1))
    names)))

(defn find-game
  "Returns game with keys `:id`, `:type`, `:name` or `nil`."
  [name]
  (let [pn (possible-names name)]
    (first
     (or
      (first-result #(some-game-result (search-game-exact %)) pn)
      (first-result #(one-game-result (search-game-non-exact %) %) pn)))))

(defn- non-zero [x]
  (if (= 0 x) nil x))

(defn- int-value [item]
  (-> item :attrs :value))

(defn- pos-int-value [item]
  (non-zero (Integer/valueOf (int-value item))))

(defn- assoc-some [game key val]
  (if (some? val)
    (assoc game key val)
    game))

(defn- detail-item->game [detail-item]
  (when detail-item
    (reduce
     (fn [game item]
       (case (:tag item)
         :thumbnail (assoc game :com.boardgamegeek.boardgame/thumbnail (-> item :content first))
         :minplayers (assoc-some game :com.boardgamegeek.boardgame/min-players (pos-int-value item))
         :maxplayers (assoc-some game :com.boardgamegeek.boardgame/max-players (pos-int-value item))
         :name (if (= (-> item :attrs :type) "primary")
                 (assoc game :com.boardgamegeek.boardgame/name (-> item :attrs :value))
                 game)
         :minplaytime (assoc-some game :com.boardgamegeek.boardgame/min-play-time (pos-int-value item))
         :maxplaytime (assoc-some game :com.boardgamegeek.boardgame/max-play-time (pos-int-value item))
         :link (case (-> item :attrs :type)
                 "boardgamecategory" (update game
                                             :com.boardgamegeek.boardgame/categories
                                             conj
                                             {:com.boardgamegeek.category/id (Integer/valueOf (-> item :attrs :id))
                                              :com.boardgamegeek.category/name (-> item :attrs :value)})
                 "boardgamemechanic" (update game
                                             :com.boardgamegeek.boardgame/mechanics
                                             conj
                                             {:com.boardgamegeek.mechanic/id (Integer/valueOf (-> item :attrs :id))
                                              :com.boardgamegeek.mechanic/name (-> item :attrs :value)})
                 game)
         :statistics (assoc game
                            :com.boardgamegeek.boardgame/rating
                            (->> (:content item)
                                 (some (fn [item] (when (= :ratings (:tag item)) item)))
                                 :content
                                 (some (fn [item] (when (= :average (:tag item)) item)))
                                 :attrs
                                 :value
                                 Float/valueOf
                                 round-10))
         game))
     {:com.boardgamegeek.boardgame/id (-> detail-item :attrs :id)}
     (:content detail-item))))

(defn- cache-game-detail [id detail]
  (cache/store (str "bgg.game-detail__" id) (pr-str detail)))

(defn- load-cached-game-detail [id]
  (edn/read-string (cache/load (str "bgg.game-detail__" id))))

(defn games-details [game-ids]
  (let [{:keys [games ids]} (reduce
                             (fn [acc game-id]
                               (if-let [detail (load-cached-game-detail game-id)]
                                 (update acc :games conj (detail-item->game detail))
                                 (update acc :ids conj game-id)))
                             {:details []
                              :ids []}
                             game-ids)]
    (into
     games
     (comp
      (partition-all 20)
      (map (fn [ids]
             (with-open [xin (url/->uncached-stream (game-details-url (str/join "," ids)))]
               (-> (clojure.xml/parse xin)
                   :content))))
      cat
      (map (fn [detail]
             (let [game (detail-item->game detail)]
               (cache-game-detail (:com.boardgamegeek.boardgame/id game) detail)
               game))))
     ids)))

(defn username->games [username]
  (let [url (game-collection-url username)]
    (with-open [xin (url/->uncached-stream url)]
      (mapv (fn [content]
              {:com.boardgamegeek.boardgame/id (get-in content [:attrs :objectid])
               :name (some
                      (fn [tag]
                        (when (= :name (:tag tag))
                          (first (:content tag))))
                      (:content content))})
            (-> (clojure.xml/parse xin)
                :content)))))
