(ns app.core
  (:require
   [clojure.pprint :as pp]
   [app.bbb :as bbb]
   [app.hp :as hp]
   [app.mp :as mp]
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
  (if (:com.boardgamegeek.boardgame/id game)
    game
    (let [found-game (bgg/find-game (:name game))
          id (:id found-game)]
      (cond-> game
        id (assoc :com.boardgamegeek.boardgame/id id)))))

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

(defn- enrich-games [games]
  (let [games-with-id (mapv enrich-game-with-id games)
        id->bgg-game (into {}
                           (comp
                            (map :com.boardgamegeek.boardgame/id)
                            (filter some?)
                            (partition-all 100)
                            (map (fn [ids]
                                   (bgg/games-details ids)))
                            cat
                            (map (fn [bgg-game]
                                   [(:com.boardgamegeek.boardgame/id bgg-game) bgg-game])))
                           games-with-id)]
    (mapv
     (fn [game]
       (-> (merge game (id->bgg-game (:com.boardgamegeek.boardgame/id game)))
           enrich-game-with-name
           enrich-game-with-uuid
           sort-game-categories
           sort-game-mechanics
           frontend-game))
     games-with-id)))

(defn- bbb-games []
  (enrich-games (bbb/games)))

(defn- hp-games []
  (enrich-games (hp/games)))

(defn- mp-games []
  (enrich-games (mp/games)))

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
  (pp/with-pprint-dispatch clojure-dispatch
    (pp/pprint (list 'def 'game-data (games->db (bbb-games))))))

(defn- print-hp-games []
  (println "(ns app.hp-data)")
  (pp/with-pprint-dispatch clojure-dispatch
    (pp/pprint (list 'def 'game-data (games->db (hp-games))))))

(defn- print-mp-games []
  (println "(ns app.mp-data)")
  (pp/with-pprint-dispatch clojure-dispatch
    (pp/pprint (list 'def 'game-data (games->db (mp-games))))))

(defn create-data [_]
  (spit "../web/src/app/hp_data.cljc" (with-out-str (print-hp-games)))
  (spit "../web/src/app/mp_data.cljc" (with-out-str (print-mp-games)))
  (spit "../web/src/app/bbb_data.cljc" (with-out-str (print-bbb-games))))
