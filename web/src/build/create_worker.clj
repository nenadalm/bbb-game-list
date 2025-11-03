(ns build.create-worker
  (:require
   [clojure.string :as str]
   [build.util :as u]))

(defn- extract-thumbnails [data]
  (into
   []
   (keep (fn [[_ game]] (:com.boardgamegeek.boardgame/thumbnail game)))
   (:game-list/games data)))

(defn- urls-to-cache [projects module-id->output-name]
  (into
   ["index.html"
    "manifest.json"
    "img/icon.svg"
    "img/powered-by-bgg.svg"
    (u/asset "img/icon.svg" module-id->output-name)
    (u/asset "js/cljs_base.js" module-id->output-name)
    (u/asset "js/app.js" module-id->output-name)
    (u/asset "css/styles.css" module-id->output-name)]
   (mapcat
    (fn [project]
      [(str (:project project) ".html")
       (u/asset (str "js/" (:project project) "_app.js") module-id->output-name)]))
   projects))

(defn- file->ns [s]
  (str/replace s "_" "-"))

(defn- extract-project-thumbnails [project]
  (let [ns-name (str "app." (file->ns (:project project)) "-data")
        ns (symbol ns-name)
        _ (require ns)
        fsym (symbol ns-name "game-data")
        game-data @(resolve fsym)]
    (extract-thumbnails game-data)))

(defn- opaque-urls-to-cache [projects]
  (into
   []
   (mapcat
    (fn [project]
      (extract-project-thumbnails project)))
   projects))

(defn- render-urls-to-cache [projects module-id->output-name]
  (str
   "const urlsToCache = ["
   (str/join "," (mapv #(str "\"" % "\"") (urls-to-cache projects module-id->output-name)))
   "];"))

(defn- render-opaque-urls-to-cache [projects]
  (str
   "const opaqueUrlsToCache = ["
   (str/join "," (mapv #(str "\"" % "\"") (opaque-urls-to-cache projects)))
   "];"))

(defn render [module-id->output-name]
  (let [projects (u/read-edn "../projects.edn")]
    (-> (slurp "./resources/private/worker.js")
        (str/replace #".*prop:urlsToCache.*" (render-urls-to-cache projects module-id->output-name))
        (str/replace #".*prop:opaqueUrlsToCache.*" (render-opaque-urls-to-cache projects))
        (str/replace
         #".*prop:relatedAppVersion.*"
         (str
          "const relatedAppVersion = \"" (u/app-version) "\";")))))
