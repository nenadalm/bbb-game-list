(ns app.project.the-grail
  (:require
   [clojure.string :as str]
   [clojure.java.io]
   [app.project :as p]))

(def ^:private games-list-url "https://www.thegrail.cz/")

(defn- games-list->game-names [game-list]
  (mapv
   (fn [game]
     (first (str/split-lines (.wholeText game))))
   (.select game-list ".div-block-4 .fn-heading-7")))

(defn games []
  (let [game-names (-> (p/parse-html games-list-url)
                       games-list->game-names)]
    (mapv
     (fn [game-name]
       {:name game-name})
     game-names)))
