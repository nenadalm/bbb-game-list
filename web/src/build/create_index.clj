(ns build.create-index
  (:require
   [clojure.java.shell :as shell]
   [clojure.java.io :as io]
   [clojure.string :as str]
   [clojure.edn :as edn]
   [build.util :as u]))

(defn- sh [& args]
  (let [result (apply shell/sh args)]
    (if (= 0 (:exit result))
      (str/trim-newline (:out result))
      (throw (ex-info "Shell command failed." {:result result})))))

(defn- app-version []
  (sh "git" "rev-parse" "HEAD"))

(defn- render-project [opts]
  (let [{:keys [title description project]} opts]
    (str
     "<!doctype html>
<html lang=\"en-US\">
  <head>
    <meta charset=\"utf-8\">
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
    <meta name=\"app-version\" content=\"" (app-version) "\">
    <meta name=\"description\" content=\"" description "\">
    <title>" title "</title>
    <link rel=\"stylesheet\" href=\"" (u/asset "css/styles.css") "\">
    <link rel=\"icon\" href=\"" (u/asset "img/icon.svg") "\" type=\"image/svg+xml\">
    <link rel=\"apple-touch-icon\" href=\"" (u/asset "img/icon_192.png") "\">
    <link rel=\"manifest\" href=\"" (u/asset "manifest.json") "\">
  </head>
  <body>
    <div id=\"app\"></div>
    <script src=\"" (u/asset "js/cljs_base.js") "\"></script>
    <script src=\"" (u/asset (str "js/" project "_app.js")) "\"></script>
    <script>app." project "_core.init();</script>
  </body>
</html>")))

(defn- render-project-item [project]
  (str "<li>
  <a href=\"" (:project project) ".html\">" (:label project) "</a>
</li>"))

(defn- render-index [projects]
  (str
   "<!doctype html>
<html lang=\"en-US\">
  <head>
    <meta charset=\"utf-8\">
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
    <meta name=\"app-version\" content=\"" (app-version) "\">
    <meta name=\"description\" content=\"List of games at various locations.\">
    <title>Games - Lists</title>
    <link rel=\"icon\" href=\"" (u/asset "img/icon.svg") "\" type=\"image/svg+xml\">
    <link rel=\"apple-touch-icon\" href=\"" (u/asset "img/icon_192.png") "\">
    <link rel=\"manifest\" href=\"" (u/asset "manifest.json") "\">
  </head>
  <body>
    Lists
    <ul>" (str/join "\n" (mapv render-project-item projects)) "</ul>
    <script src=\"" (u/asset "js/cljs_base.js") "\"></script>
    <script src=\"" (u/asset "js/app.js") "\"></script>
    <script>app.core.init();</script>
  </body>
</html>"))

(defn execute [_]
  (let [projects (u/read-edn "../projects.edn")]
    (doseq [project projects]
      (spit (str "resources/public/" (:project project) ".html") (render-project project)))
    (spit "resources/public/index.html" (render-index projects))))
