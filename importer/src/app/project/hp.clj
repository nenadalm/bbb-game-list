(ns app.project.hp
  (:require
   [clojure.string]
   [clojure.java.io]
   [app.project :as p]))

(def ^:private games-list-url "https://www.herniprostor.cz/pujcovna/")

(defn- game->name [game]
  (->> (.text game)
       clojure.string/trim))

(defn- game-list->game-names [game-list]
  (into
   []
   (comp
    (mapcat #(.textNodes %))
    (map game->name)
    (filter seq))
   (.select game-list "tr:not(:first-child) td:first-child span")))

(defn games []
  (let [game-names (->> (p/parse-html games-list-url)
                        game-list->game-names)]
    (mapv
     (fn [game-name]
       {:name game-name
        :cz.herniprostor/name game-name})
     game-names)))
