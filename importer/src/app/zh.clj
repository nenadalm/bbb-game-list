(ns app.zh
  (:require
   [clojure.string :as str]
   [app.url :as url])
  (:import
   [org.jsoup Jsoup]))

(defn- game-doc [url]
  (with-open [xin (url/->cached-stream (java.net.URL. url))]
    (Jsoup/parse xin "utf-8" url)))

(defn game-name [game-url]
  (let [doc (game-doc game-url)]
    (str/trim (.text (.select doc "h1")))))
