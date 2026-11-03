(ns app.project.the-grail
  (:require
   [clojure.string :as str]
   [clojure.java.io]
   [app.project :as p]))

(def ^:private games-list-url "https://www.thegrail.cz/")

(defn- doc->game-list [doc]
  (.select doc ".div-block-4 .fn-features-card-2"))

(defn- game->name [game]
  (-> game
      (.select ".fn-heading-7")
      first
      (.wholeText)
      str/split-lines
      first))

(defn- game->thumbnail [game]
  (-> game
      (.select "img")
      first
      (.attr "src")))

(defn- game->game-info [game]
  {:name (game->name game)
   :thumbnail (game->thumbnail game)})

(defn games []
  (mapv game->game-info
        (-> (p/parse-html games-list-url)
            doc->game-list)))
