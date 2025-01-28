(ns app.project.pnr
  (:require
   [clojure.string :as str]
   [clojure.java.io]
   [app.project :as p]))

(def ^:private games-list-url "https://www.pekloneberaj.cz/stolni-hry-2023/")

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
  (let [doc (p/parse-html games-list-url)]
    (mapv game->game-info (doc->game-list doc))))
