(ns build.create-worker
  (:require
   [clojure.string :as str]
   [build.util :as u]
   [app.bbb-data]
   [app.hp-data]))

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

(defn- opaque-urls-to-cache []
  (into
   []
   cat
   [(extract-thumbnails app.bbb-data/game-data)
    (extract-thumbnails app.hp-data/game-data)]))

(defn- render-urls-to-cache [projects]
  (str
   "const urlsToCache = ["
   (str/join "," (mapv #(str "\"" % "\"") (urls-to-cache projects)))
   "];"))

(defn- render-opaque-urls-to-cache []
  (str
   "const opaqueUrlsToCache = ["
   (str/join "," (mapv #(str "\"" % "\"") (opaque-urls-to-cache)))
   "];"))

(defn- render [projects]
  (-> (slurp "./resources/private/worker.js")
      (str/replace #".*prop:urlsToCache.*" (render-urls-to-cache projects))
      (str/replace #".*prop:opaqueUrlsToCache.*" (render-opaque-urls-to-cache))))

(defn -main []
  (let [projects (u/read-edn "../projects.edn")]
    (println (render projects))))
