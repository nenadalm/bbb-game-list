(ns app.core
  (:require
   [clojure.pprint :as pp]
   [app.bbb :as bbb]
   [app.bgg :as bgg]
   [app.pprint :refer [clojure-dispatch]]
   [app.uuid :as uuid]
   [clojure.data.priority-map :as priority-map])
  (:import
   [org.jsoup Jsoup]))

(defn- tap [x]
  (binding [*out* *err*]
    (println x)))

(add-tap tap)

(defn- game-id [search-result]
  (get-in search-result [0 :attrs :id]))

(defn- non-zero [x]
  (if (= 0 x) nil x))

(defn- add-game-details [game item]
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

(defn- enrich-game-with-uuid [game]
  (assoc game :game/id (uuid/from-string (:game/name game))))

(defn- enrich-game-with-id [game]
  (let [found (bgg/search-game (:name game))
        id (game-id found)]
    (cond-> game
      id (assoc :com.boardgamegeek.boardgame/id id))))

(defn- enrich-game-with-bgg-info [game]
  (if-let [game-id (:com.boardgamegeek.boardgame/id game)]
    (let [response (bgg/game-details game-id)
          details (get-in response [:content 0 :content])]
      (reduce
       add-game-details
       game
       details))
    game))

(defn- enrich-game-with-name [game]
  (assoc game :game/name (or (:com.boardgamegeek.boardgame/name game) (:name game))))

(defn- frontend-game [game]
  (select-keys game [:languages
                     :game/id
                     :game/name
                     :com.boardgamegeek.boardgame/id
                     :com.boardgamegeek.boardgame/max-play-time
                     :com.boardgamegeek.boardgame/max-players
                     :com.boardgamegeek.boardgame/min-play-time
                     :com.boardgamegeek.boardgame/min-players
                     :com.boardgamegeek.boardgame/thumbnail
                     :com.boardgamegeek.boardgame/categories
                     :com.boardgamegeek.boardgame/mechanics]))

(defn- sort-game-mechanics [game]
  (if (:com.boardgamegeek.boardgame/mechanics game)
    (update game
            :com.boardgamegeek.boardgame/mechanics
            #(sort-by (comp clojure.string/lower-case :com.boardgamegeek.mechanic/name) %))
    game))

(defn- sort-game-categories [game]
  (if (:com.boardgamegeek.boardgame/categories game)
    (update game
            :com.boardgamegeek.boardgame/categories
            #(sort-by (comp clojure.string/lower-case :com.boardgamegeek.category/name) %))
    game))

(defn- game-info [bbb-game]
  (-> bbb-game
      enrich-game-with-id
      enrich-game-with-bgg-info
      enrich-game-with-name
      enrich-game-with-uuid
      sort-game-categories
      sort-game-mechanics
      frontend-game))

(defn- bbb-games []
  (->> (bbb/games)
       (mapv game-info)))

(defn- index-by [f coll]
  (reduce
   (fn [m v]
     (assoc m (f v) v))
   {}
   coll))

(defn- games-sorting [games]
  (reduce
   (fn [m [k keyfn]]
     (assoc m k (mapv :game/id (sort-by keyfn games))))
   {}
   [[:game/name (comp clojure.string/lower-case :game/name)]
    [:com.boardgamegeek.boardgame/min-players :com.boardgamegeek.boardgame/min-players]
    [:com.boardgamegeek.boardgame/max-players :com.boardgamegeek.boardgame/max-players]
    [:com.boardgamegeek.boardgame/min-play-time :com.boardgamegeek.boardgame/min-play-time]
    [:com.boardgamegeek.boardgame/max-play-time :com.boardgamegeek.boardgame/max-play-time]]))

(defn- games->db [games]
  (let [games-list (into (priority-map/priority-map-keyfn :game/name)
                         (index-by :game/id games))]
    {:game-list/games games-list
     :game-list/sorting (games-sorting (vals games-list))}))

(defn -main [& args]
  (println "(ns app.data)")
  (println "(def game-data")
  (pp/with-pprint-dispatch clojure-dispatch
    (pp/pprint (games->db (bbb-games))))
  (println ")"))
