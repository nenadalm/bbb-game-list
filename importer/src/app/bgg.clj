(ns app.bgg
  (:require
   [clojure.java.io]
   [clojure.xml]
   [app.url :as url]))

(def ^:private api-root "https://www.boardgamegeek.com/xmlapi2")

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
                               "/thing?type=boardgame&id="
                               game-id)))

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

(defn- one-game-result [games name]
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
        (= 1 (count length+1)) length+1))))

(defn- some-game-result [games]
  (when (< 0 (count games))
    games))

(def ^:private name-fixers
  [#(clojure.string/replace % " and " " & ")
   #(clojure.string/replace % "’" "'")])

(defn- possible-names [name]
  (let [fixed-names (into #{} (map #(% name)) name-fixers)]
    (into [name] (disj fixed-names name))))

(defn find-game
  "Returns game with keys `:id`, `:type`, `:name` or `nil`."
  [name]
  (first
   (or
    (first
     (into
      []
      (comp
       (keep #(some-game-result (search-game-exact %)))
       (take 1))
      (possible-names name)))
    (some-game-result (search-game-exact name))
    (one-game-result (search-game-non-exact name) name))))

(defn- non-zero [x]
  (if (= 0 x) nil x))

(defn- detail-item->game [detail-item]
  (when detail-item
    (reduce
     (fn [game item]
       (case (:tag item)
         :thumbnail (assoc game :com.boardgamegeek.boardgame/thumbnail (-> item :content first))
         :minplayers (assoc game :com.boardgamegeek.boardgame/min-players (Integer/valueOf (-> item :attrs :value)))
         :maxplayers (assoc game :com.boardgamegeek.boardgame/max-players (Integer/valueOf (-> item :attrs :value)))
         :name (if (= (-> item :attrs :type) "primary")
                 (assoc game :com.boardgamegeek.boardgame/name (-> item :attrs :value))
                 game)
         :minplaytime (if-let [time (non-zero (Integer/valueOf (-> item :attrs :value)))]
                        (assoc game :com.boardgamegeek.boardgame/min-play-time time)
                        game)
         :maxplaytime (if-let [time (non-zero (Integer/valueOf (-> item :attrs :value)))]
                        (assoc game :com.boardgamegeek.boardgame/max-play-time time)
                        game)
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
         game))
     {:com.boardgamegeek.boardgame/id (-> detail-item :attrs :id)}
     (:content detail-item))))

(defn game-details [game-id]
  (let [url (game-details-url game-id)]
    (with-open [xin (url/->cached-stream url)]
      (-> (clojure.xml/parse xin)
          :content
          first
          detail-item->game))))
