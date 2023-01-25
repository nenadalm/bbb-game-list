(ns build.create-index
  (:require
   [clojure.java.shell :as shell]
   [clojure.string :as str]
   [build.util :as u]))

(defn- sh [& args]
  (let [result (apply shell/sh args)]
    (if (= 0 (:exit result))
      (str/trim-newline (:out result))
      (throw (ex-info "Shell command failed." {:result result})))))

(defn- app-version []
  (sh "git" "rev-parse" "HEAD"))

(defn- render-bbb []
  (str
   "<!doctype html>
<html lang=\"en-US\">
  <head>
    <meta charset=\"utf-8\">
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
    <meta name=\"app-version\" content=\"" (app-version) "\">
    <meta name=\"description\" content=\"List of games at Bohemia boards and brews.\">
    <title>Games - Bohemia boards and brews</title>
    <link rel=\"stylesheet\" href=\"" (u/asset "css/styles.css") "\">
    <link rel=\"icon\" href=\"" (u/asset "img/icon.svg") "\" type=\"image/svg+xml\">
    <link rel=\"apple-touch-icon\" href=\"" (u/asset "img/icon_192.png") "\">
    <link rel=\"manifest\" href=\"" (u/asset "manifest.json") "\">
  </head>
  <body>
    <div id=\"app\"></div>
    <script src=\"" (u/asset "js/cljs_base.js") "\"></script>
    <script src=\"" (u/asset "js/bbb_app.js") "\"></script>
    <script>app.bbb_core.init();</script>
  </body>
</html>"
   ))

(defn- render-hp []
  (str
   "<!doctype html>
<html lang=\"en-US\">
  <head>
    <meta charset=\"utf-8\">
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
    <meta name=\"app-version\" content=\"" (app-version) "\">
    <meta name=\"description\" content=\"List of games at Herní prostor.\">
    <title>Games - Herní prostor</title>
    <link rel=\"stylesheet\" href=\"" (u/asset "css/styles.css") "\">
    <link rel=\"icon\" href=\"" (u/asset "img/icon.svg") "\" type=\"image/svg+xml\">
    <link rel=\"apple-touch-icon\" href=\"" (u/asset "img/icon_192.png") "\">
    <link rel=\"manifest\" href=\"" (u/asset "manifest.json") "\">
  </head>
  <body>
    <div id=\"app\"></div>
    <script src=\"" (u/asset "js/cljs_base.js") "\"></script>
    <script src=\"" (u/asset "js/hp_app.js") "\"></script>
    <script>app.hp_core.init();</script>
  </body>
</html>"
   ))

(defn- render-index []
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
    <ul>
      <li>
        <a href=\"bbb.html\">bohemiaboardsandbrews.com</a>
      </li>
      <li>
        <a href=\"hp.html\">herniprostor.cz</a>
      </li>
    </ul>
    <script src=\"" (u/asset "js/cljs_base.js") "\"></script>
    <script src=\"" (u/asset "js/app.js") "\"></script>
    <script>app.core.init();</script>
  </body>
</html>"
   ))

(defn print-bbb [_]
  (println (render-bbb)))

(defn print-hp [_]
  (println (render-hp)))

(defn print-index [_]
  (println (render-index)))
