(ns build.create-index
  (:require
   [clojure.string :as str]
   [build.util :as u]))

(defn- render-project [opts module-id->output-name]
  (let [{:keys [title description project]} opts]
    (str
     "<!doctype html>
<html lang=\"en-US\">
  <head>
    <meta charset=\"utf-8\">
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
    <meta name=\"app-version\" content=\"" (u/app-version) "\">
    <meta name=\"description\" content=\"" description "\">
    <title>" title "</title>
    <link rel=\"stylesheet\" href=\"" (u/asset "css/styles.css" module-id->output-name) "\">
    <link rel=\"icon\" href=\"" (u/asset "img/icon.svg" module-id->output-name) "\" type=\"image/svg+xml\">
    <link rel=\"apple-touch-icon\" href=\"" (u/asset "img/icon_192.png" module-id->output-name) "\">
    <link rel=\"manifest\" href=\"" (u/asset "manifest.json" module-id->output-name) "\">
  </head>
  <body>
    <div id=\"app\"></div>
    <script src=\"" (u/asset "js/cljs_base.js" module-id->output-name) "\"></script>
    <script src=\"" (u/asset (str "js/" project "_app.js") module-id->output-name) "\"></script>
    <script>app." project "_core.init();</script>
  </body>
</html>")))

(defn- render-project-item [project]
  (str "<li>
  <a href=\"" (:project project) ".html\">" (:label project) "</a>
</li>"))

(defn- render-index [projects module-id->output-name]
  (str
   "<!doctype html>
<html lang=\"en-US\">
  <head>
    <meta charset=\"utf-8\">
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
    <meta name=\"app-version\" content=\"" (u/app-version) "\">
    <meta name=\"description\" content=\"List of games at various locations.\">
    <title>Games - Lists</title>
    <link rel=\"icon\" href=\"" (u/asset "img/icon.svg" module-id->output-name) "\" type=\"image/svg+xml\">
    <link rel=\"apple-touch-icon\" href=\"" (u/asset "img/icon_192.png" module-id->output-name) "\">
    <link rel=\"manifest\" href=\"" (u/asset "manifest.json" module-id->output-name) "\">
  </head>
  <body>
    Lists
    <ul>" (str/join "\n" (mapv render-project-item projects)) "</ul>
    <div class=\"footer\"><p>Version: " (u/app-version) "</p><img src=\"img/powered-by-bgg.svg\"></div>
    <script src=\"" (u/asset "js/cljs_base.js" module-id->output-name) "\"></script>
    <script src=\"" (u/asset "js/app.js" module-id->output-name) "\"></script>
    <script>app.core.init();</script>
  </body>
</html>"))

(defn execute [module-id->output-name]
  (let [projects (u/read-edn "../projects.edn")]
    (doseq [project projects]
      (spit (str "resources/public/" (:project project) ".html") (render-project project module-id->output-name)))
    (spit "resources/public/index.html" (render-index projects module-id->output-name))))
