(ns app.project.mp
  (:require
   [clojure.string :as str]
   [clojure.java.io])
  (:import
   [org.jsoup Jsoup]))

(def ^:private groups-list-url "https://www.manapotion.cz/na%C5%A1e-hry")

(defn- create-url [s]
  (let [uri (java.net.URI. s)
        path (.getPath uri)
        escaped-path (str/join "/" (mapv #(java.net.URLEncoder/encode %) (str/split path #"/")))]
    (java.net.URL.
     (.getScheme uri)
     (.getHost uri)
     (.getPort uri)
     escaped-path)))

(defn- url->doc [url]
  (with-open [xin (clojure.java.io/input-stream (create-url url))]
    (Jsoup/parse xin "utf-8" url)))

(defn- groups-list->game-urls [groups-list]
  (mapv (fn [el] (.attr el "href")) (.select groups-list "h2 a")))

(defn- game->name [game]
  (->> (.text game)
       clojure.string/trim))

(defn- game-list->game-names [game-list]
  (mapv game->name (.select game-list ".wixui-repeater__item .wixui-image + div h6")))

(defn games []
  (into
   []
   (comp
    (mapcat
     (fn [url]
       (game-list->game-names (url->doc url))))
    (map (fn [game-name]
           {:name game-name
            :cz.manapotion/name game-name})))
   (groups-list->game-urls (url->doc groups-list-url))))
