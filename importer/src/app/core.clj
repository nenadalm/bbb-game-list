(ns app.core
  (:require
   [clojure.pprint :as pp]
   [app.bgg :as bgg]
   [app.zh :as zh]
   [app.pprint :refer [clojure-dispatch]]
   [app.uuid :as uuid]
   [clojure.data.priority-map :as priority-map]
   [clojure.edn :as edn]
   [clojure.string :as str]
   [clojure.java.io :as io]
   [jsonista.core :as j]
   [app.opencv :as opencv]))

(defn- tap [x]
  (binding [*out* *err*]
    (println x)))

(add-tap tap)

(defn- read-edn [f]
  (with-open [r (io/reader f)]
    (edn/read (java.io.PushbackReader. r))))

(defn- get-projects []
  (read-edn "../projects.edn"))

(defn- enrich-game-with-uuid [game]
  (assoc game :game/id (uuid/from-string (:game/name game))))

(defn- enrich-game-with-ids [game]
  (if (:com.boardgamegeek.boardgame/id game)
    game
    (let [found-games (or (some-> (:cz.zatrolene-hry.boardgame/url game)
                                  zh/game-name
                                  bgg/find-games)
                          (bgg/find-games (:name game)))
          ids (when found-games (mapv :id found-games))]
      (cond-> game
        ids (assoc :com.boardgamegeek.boardgame/ids ids)))))

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

(defn- extract-bgg-ids [games]
  (into #{}
        (comp
         (mapcat (fn [game]
                   (conj
                    (:com.boardgamegeek.boardgame/ids game [])
                    (:com.boardgamegeek.boardgame/id game))))
         (filter some?))
        games))

(defn- best-match [game possible-bgg-games]
  (or
   (let [game-image (opencv/url->image (:thumbnail game))]
     (some
      (fn [possible-match]
        (when (opencv/same?
               game-image
               (opencv/url->image (:com.boardgamegeek.boardgame/thumbnail possible-match)))
          possible-match))
      possible-bgg-games))
   (first possible-bgg-games)))

(defn- enrich-games [games]
  (let [games-with-ids (mapv enrich-game-with-ids games)
        bgg-ids (extract-bgg-ids games-with-ids)
        id->bgg-game (into {}
                           (comp
                            (map (fn [bgg-game]
                                   [(:com.boardgamegeek.boardgame/id bgg-game) bgg-game])))
                           (bgg/games-details bgg-ids))]
    (mapv
     (fn [game]
       (-> (if-let [id (:com.boardgamegeek.boardgame/id game)]
             (merge game (id->bgg-game id))
             (if-let [matched-id (first (:com.boardgamegeek.boardgame/ids game))]
               (merge
                game
                {:com.boardgamegeek.boardgame/id matched-id}
                (best-match game (mapv id->bgg-game (:com.boardgamegeek.boardgame/ids game))))
               game))
           enrich-game-with-name
           enrich-game-with-uuid
           sort-game-categories
           sort-game-mechanics
           frontend-game))
     games-with-ids)))

(defn- file->ns [s]
  (str/replace s "_" "-"))

(defn- project->games [project]
  (let [ns-name (str "app.project." (file->ns (:project project)))
        ns (symbol ns-name)
        _ (require ns)
        fsym (symbol ns-name "games")
        f @(resolve fsym)]
    (f)))

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

(defn- assert-project-games [project games]
  (when-not (seq games)
    (throw (ex-info (str "No games found for project \"" (:project project) "\".") {:project (:project project)}))))

(defn- project-data-path [project]
  (str "target/" (:project project) ".edn"))

(defn- create-project-data-web [project games]
  (spit
   (str "../web/src/app/" (:project project) "_data.cljc")
   (with-out-str
     (print-games (str "app." (file->ns (:project project)) "-data") games))))

(defn list-projects [_]
  (println (j/write-value-as-string (mapv :project (get-projects)))))

(defn- filter-projects [project projects]
  (let [excluded (hash-set)]
    (if project
      (filterv
       (fn [p]
         (= project (:project p)))
       projects)
      (filterv
       (fn [p]
         (not (excluded (:project p))))
       projects))))

(defn create-projects-data [{:keys [project]}]
  (let [projects (get-projects)
        projects (filter-projects project projects)]
    (doseq [project projects]
      (let [games (project->games project)
            target-path (project-data-path project)]
        (-> (java.io.File. target-path)
            (.getParentFile)
            (.mkdirs))
        (assert-project-games project games)
        (spit
         target-path
         (pr-str games))))))

(defn create-data-from-projects-data [{:keys [project]}]
  (let [projects (get-projects)
        projects (filter-projects project projects)]
    (doseq [project projects]
      (let [games (enrich-games (read-edn (project-data-path project)))]
        (assert-project-games project games)
        (create-project-data-web project games)))))

(defn create-data [{:keys [project]}]
  (let [projects (get-projects)
        projects (filter-projects project projects)]
    (doseq [project projects]
      (let [games (-> (project->games project)
                      enrich-games)]
        (assert-project-games project games)
        (create-project-data-web project games)))))
