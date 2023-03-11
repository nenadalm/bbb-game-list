(ns app.core
  (:require
   [clojure.pprint :as pp]
   [app.bbb :as bbb]
   [app.hp :as hp]
   [app.bgg :as bgg]
   [app.pprint :refer [clojure-dispatch]]
   [app.uuid :as uuid]
   [clojure.data.priority-map :as priority-map]
   [clojure.string]))

(defn- tap [x]
  (binding [*out* *err*]
    (println x)))

(add-tap tap)

(defn- enrich-game-with-uuid [game]
  (assoc game :game/id (uuid/from-string (:game/name game))))

(defn- enrich-game-with-id [game]
  (let [found-game (bgg/find-game (:name game))
        id (:id found-game)]
    (cond-> game
      id (assoc :com.boardgamegeek.boardgame/id id))))

(defn- enrich-game-with-bgg-info [game]
  (if-let [game-id (:com.boardgamegeek.boardgame/id game)]
    (let [details (bgg/game-details game-id)]
      (merge game details))
    game))

(defn- enrich-game-with-name [game]
  (assoc game :game/name (or (:com.boardgamegeek.boardgame/name game) (:name game))))

(defn- frontend-game [game]
  (select-keys game [:languages
                     :name
                     :new
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

(defn- game-info [game]
  (-> game
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

(defn- hp-games []
  (->> (hp/games)
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

(defn- print-bbb-games []
  (println "(ns app.bbb-data)")
  (println "(def game-data")
  (pp/with-pprint-dispatch clojure-dispatch
    (pp/pprint (games->db (bbb-games))))
  (println ")"))

(defn- print-hp-games []
  (println "(ns app.hp-data)")
  (println "(def game-data")
  (pp/with-pprint-dispatch clojure-dispatch
    (pp/pprint (games->db (hp-games))))
  (println ")"))

(defn create-data [_]
  (spit "../web/src/app/hp_data.cljc" (with-out-str (print-hp-games)))
  (spit "../web/src/app/bbb_data.cljc" (with-out-str (print-bbb-games))))
