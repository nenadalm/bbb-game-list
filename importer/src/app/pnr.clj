(ns app.pnr
  (:require
   [clojure.string :as str]
   [clojure.java.io])
  (:import
   [org.jsoup Jsoup]))

(def ^:private games-list-url "https://www.pekloneberaj.cz/stolni-hry-2023/")

(defn- game-list-doc [url]
  (with-open [xin (clojure.java.io/input-stream (java.net.URL. url))]
    (Jsoup/parse xin "utf-8" url)))

(defn- doc->game-list [doc]
  (.select doc "h2[class=wp-block-heading]"))

(defn game->game-info [game]
  {:name (-> (.text game)
             (str/replace #"^–" "")
             str/trim)
   :cz.zatrolene-hry.boardgame/url (-> game
                                       (.nextElementSibling)
                                       (.select "a[href*=zatrolene-hry.cz]")
                                       (.attr "href")
                                       not-empty)})

(defn games []
  (let [doc (game-list-doc games-list-url)]
    (mapv game->game-info (doc->game-list doc))))
