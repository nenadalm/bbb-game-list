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
  (get-in search-result [:content 0 :attrs :id]))

(defn- add-game-details [game item]
  (case (:tag item)
    :thumbnail (assoc game :com.boardgamegeek.boardgame/thumbnail (-> item :content first))
    :minplayers (assoc game :com.boardgamegeek.boardgame/min-players (Integer/valueOf (-> item :attrs :value)))
    :maxplayers (assoc game :com.boardgamegeek.boardgame/max-players (Integer/valueOf (-> item :attrs :value)))
    :name (if (= (-> item :attrs :type) "primary")
            (assoc game :com.boardgamegeek.boardgame/name (-> item :attrs :value))
            game)
    :minplaytime (assoc game :com.boardgamegeek.boardgame/min-play-time (Integer/valueOf (-> item :attrs :value)))
    :maxplaytime (assoc game :com.boardgamegeek.boardgame/max-play-time (Integer/valueOf (-> item :attrs :value)))
    game))

(defn- enrich-games-with-uuid [games]
  (map (fn [game]
         (assoc game :game/id (uuid/generate)))
       games))

(defn- enrich-games-with-id [games]
  (map (fn [game-info]
         (let [found (bgg/search-game (:name game-info))
               id (game-id found)]
           (cond-> game-info
             id (assoc :com.boardgamegeek.boardgame/id id))))
       games))

(defn- enrich-games-with-bgg-info [games]
  (map (fn [game]
         (if-let [game-id (:com.boardgamegeek.boardgame/id game)]
           (let [response (bgg/game-details game-id)
                 details (get-in response [:content 0 :content])]
             (reduce
              add-game-details
              game
              details))
           game))
       games))

(defn- enrich-games-with-name [games]
  (map (fn [game]
         (assoc game :game/name (or (:com.boardgamegeek.boardgame/name game) (:name game))))
       games))

(defn- bbb-games []
  (-> (bbb/games)
      enrich-games-with-uuid
      enrich-games-with-id
      enrich-games-with-bgg-info
      enrich-games-with-name))

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
  {:game-list/games (into (priority-map/priority-map-keyfn :game/name)
                          (index-by :game/id games))
   :game-list/sorting (games-sorting games)})

(defn -main [& args]
  (println "(ns app.data)")
  (println "(def game-data")
  (pp/with-pprint-dispatch clojure-dispatch
    (pp/pprint (games->db (bbb-games))))
  (println ")"))
