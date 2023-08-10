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

(defn- urls-to-cache []
  [""
   "index.html"
   "hp.html"
   "bbb.html"
   "mp.html"
   "manifest.json"
   "img/icon.svg"
   (u/asset "img/icon.svg")
   (u/asset "js/cljs_base.js")
   (u/asset "js/app.js")
   (u/asset "js/hp_app.js")
   (u/asset "js/bbb_app.js")
   (u/asset "js/mp_app.js")
   (u/asset "css/styles.css")])

(defn- opaque-urls-to-cache []
  (into
   []
   cat
   [(extract-thumbnails app.bbb-data/game-data)
    (extract-thumbnails app.hp-data/game-data)]))

(defn- render-urls-to-cache []
  (str
   "const urlsToCache = ["
   (str/join "," (mapv #(str "\"" % "\"") (urls-to-cache)))
   "];"))

(defn- render-opaque-urls-to-cache []
  (str
   "const opaqueUrlsToCache = ["
   (str/join "," (mapv #(str "\"" % "\"") (opaque-urls-to-cache)))
   "];"))

(defn- render []
  (-> (slurp "./resources/private/worker.js")
      (str/replace #".*prop:urlsToCache.*" (render-urls-to-cache))
      (str/replace #".*prop:opaqueUrlsToCache.*" (render-opaque-urls-to-cache))))

(defn -main []
  (println (render)))
