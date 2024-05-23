(ns app.mlp
  (:require
   [clojure.java.io])
  (:import
   [org.jsoup Jsoup]))

(def ^:private games-list-url "https://search.mlp.cz/cz/?action=c_s_ol&kde=all&query=&navigation=%2Bngeneric4%3A%5E%22hra%22%24n%24%20%2Bngeneric7%3A%5E%22P%22%24n%24")

(defn- game-list-doc [url]
  (with-open [xin (clojure.java.io/input-stream (java.net.URL. url))]
    (Jsoup/parse xin "utf-8" url)))

(defn- doc->game-list [doc]
  (.select doc "#katalog-list .titul"))

(defn- game->game-info [game]
  {:name (.text (.select game "a[itemprop=name]"))})

(defn games []
  (loop [offset 0
         games []]
    (let [url (str games-list-url "&offset=" offset)
          games* (mapv game->game-info (doc->game-list (game-list-doc url)))
          cnt (count games*)]
      (if (< 0 cnt)
        (recur (+ cnt offset) (into games games*))
        games))))
