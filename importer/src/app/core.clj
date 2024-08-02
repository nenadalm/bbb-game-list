(ns app.core
  (:require
   [clojure.pprint :as pp]
   [app.bgg :as bgg]
   [app.zh :as zh]
   [app.pprint :refer [clojure-dispatch]]
   [app.uuid :as uuid]
   [clojure.data.priority-map :as priority-map]
   [clojure.edn :as edn]
   [clojure.string]
   [clojure.java.io :as io]
   [jsonista.core :as j]))

(defn- tap [x]
  (binding [*out* *err*]
    (println x)))

(add-tap tap)

(defn- read-edn [f]
  (with-open [r (io/reader f)]
    (edn/read (java.io.PushbackReader. r))))

(defn- enrich-game-with-uuid [game]
  (assoc game :game/id (uuid/from-string (:game/name game))))

(defn- enrich-game-with-id [game]
  (if (:com.boardgamegeek.boardgame/id game)
    game
    (let [found-game (or (some-> (:cz.zatrolene-hry.boardgame/url game)
                                 zh/game-name
                                 bgg/find-game)
                         (bgg/find-game (:name game)))
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
                     :com.boardgamegeek.boardgame/rating
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
                            (partition-all 20)
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

(defn- project->games [project]
  (let [ns-name (str "app." (:project project))
        ns (symbol ns-name)
        _ (require ns)
        fsym (symbol ns-name "games")
        f @(resolve fsym)]
    (enrich-games (f))))

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
    [:com.boardgamegeek.boardgame/rating :com.boardgamegeek.boardgame/rating]
    [:com.boardgamegeek.boardgame/min-players :com.boardgamegeek.boardgame/min-players]
    [:com.boardgamegeek.boardgame/max-players :com.boardgamegeek.boardgame/max-players]
    [:com.boardgamegeek.boardgame/min-play-time :com.boardgamegeek.boardgame/min-play-time]
    [:com.boardgamegeek.boardgame/max-play-time :com.boardgamegeek.boardgame/max-play-time]]))

(defn- games->db [games]
  (let [games-list (into (priority-map/priority-map-keyfn :game/name)
                         (index-by :game/id games))]
    {:game-list/games games-list
     :game-list/sorting (games-sorting (vals games-list))}))

(defn- print-games [ns games]
  (println (str "(ns " ns ")"))
  (pp/with-pprint-dispatch clojure-dispatch
    (pp/pprint (list 'def 'game-data (games->db games)))))

(defn list-projects [_]
  (println (j/write-value-as-string (mapv :project (read-edn "../projects.edn")))))

(defn create-data [{:keys [project]}]
  (let [projects (read-edn "../projects.edn")
        projects (if project (filterv #(= (:project %) project) projects) projects)]
    (doseq [project projects]
      (let [games-path (str "../web/src/app/" (:project project) "_data.cljc")
            games (project->games project)]
        (when-not (seq games)
          (throw (ex-info (str "No games found for project \"" (:project project) "\".") {:project (:project project)})))
        (spit
         games-path
         (with-out-str
           (print-games (str "app." (:project project) "-data") games)))))))
