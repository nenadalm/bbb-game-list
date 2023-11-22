(ns build.create-worker
  (:require
   [clojure.string :as str]
   [build.util :as u]))

(defn- extract-thumbnails [data]
  (into
   []
   (keep (fn [[_ game]] (:com.boardgamegeek.boardgame/thumbnail game)))
   (:game-list/games data)))

(defn- urls-to-cache [projects]
  (into
   [""
    "index.html"
    "manifest.json"
    "img/icon.svg"
    (u/asset "img/icon.svg")
    (u/asset "js/cljs_base.js")
    (u/asset "js/app.js")
    (u/asset "css/styles.css")]
   (mapcat
    (fn [project]
      [(str (:project project) ".html")
       (u/asset (str "js/" (:project project) "_app.js"))]))
   projects))

(defn- extract-project-thumbnails [project]
  (let [ns-name (str "app." (:project project) "-data")
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

(defn- render-urls-to-cache [projects]
  (str
   "const urlsToCache = ["
   (str/join "," (mapv #(str "\"" % "\"") (urls-to-cache projects)))
   "];"))

(defn- render-opaque-urls-to-cache [projects]
  (str
   "const opaqueUrlsToCache = ["
   (str/join "," (mapv #(str "\"" % "\"") (opaque-urls-to-cache projects)))
   "];"))

(defn- render [projects]
  (-> (slurp "./resources/private/worker.js")
      (str/replace #".*prop:urlsToCache.*" (render-urls-to-cache projects))
      (str/replace #".*prop:opaqueUrlsToCache.*" (render-opaque-urls-to-cache projects))))

(defn -main []
  (let [projects (u/read-edn "../projects.edn")]
    (println (render projects))))
