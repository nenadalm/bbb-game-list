(ns app.project.pnr
  (:require
   [clojure.string :as str]
   [clojure.java.io]
   [app.project :as p]))

(def ^:private games-list-url "https://pekloneberaj.cz/pages/stolni-hry")

(defn- doc->game-list [doc]
  (.select doc "h2:not(:first-child)"))

(defn game->game-info [game]
  (let [url (-> game
                (.nextElementSibling)
                (.select "a[href*=www.zatrolene-hry.cz]")
                (.attr "href")
                not-empty)]
    (cond->
     {:name (-> (.text game)
                (str/replace #"^–" "")
                str/trim)}
      url (assoc :cz.zatrolene-hry.boardgame/url url))))

(defn games []
  (let [doc (p/parse-html games-list-url)]
    (into
     []
     (comp
      (map game->game-info)
      (filter (fn [game]
                (<= 2 (count (:name game))))))
     (doc->game-list doc))))
