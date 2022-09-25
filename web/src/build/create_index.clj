(ns build.create-index
  (:require
   [clojure.java.io :as io]))

(defn- sha-1 [s]
  (let [c (java.security.MessageDigest/getInstance "sha-1")]
    (.update c (.getBytes s "utf-8"))
    (.encodeHex (at.favre.lib.bytes.Bytes/wrap (.digest c)))))

(defn- file-hash [f]
  (-> f
      slurp
      sha-1))

(defn- asset [path]
  (if-let [url (io/resource (str "public/" path))]
    (str path "?v=" (file-hash url))
    (throw (ex-info "Asset not found." {:path path}))))

(defn- render-bbb []
  (str
   "<!doctype html>
<html lang=\"en-US\">
  <head>
    <meta charset=\"utf-8\">
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
    <title>Games - Bohemia boards and brews</title>
    <link rel=\"stylesheet\" href=\"" (asset "css/styles.css") "\">
  </head>
  <body>
    <div id=\"app\"></div>
    <script src=\"" (asset "js/cljs_base.js") "\"></script>
    <script src=\"" (asset "js/bbb_app.js") "\"></script>
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
    <title>Games - Herní prostor</title>
    <link rel=\"stylesheet\" href=\"" (asset "css/styles.css") "\">
  </head>
  <body>
    <div id=\"app\"></div>
    <script src=\"" (asset "js/cljs_base.js") "\"></script>
    <script src=\"" (asset "js/hp_app.js") "\"></script>
    <script>app.hp_core.init();</script>
  </body>
</html>"
   ))

(defn print-bbb [_]
  (println (render-bbb)))

(defn print-hp [_]
  (println (render-hp)))
