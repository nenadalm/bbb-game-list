(ns build.create-worker
  (:require
   [clojure.string :as str]
   [build.util :as u]))

(defn- urls-to-cache []
  [""
   "index.html"
   "hp.html"
   "bbb.html"
   "manifest.json"
   "img/icon.svg"
   (u/asset "js/cljs_base.js")
   (u/asset "js/app.js")
   (u/asset "js/hp_app.js")
   (u/asset "js/bbb_app.js")
   (u/asset "css/styles.css")])

(defn- render []
  (str/replace
   (slurp "./resources/private/worker.js")
   #".*prop:urlsToCache.*"
   (str
    "const urlsToCache = ["
    (str/join "," (mapv #(str "\"" % "\"") (urls-to-cache)))
    "];")))

(defn -main []
  (println (render)))
