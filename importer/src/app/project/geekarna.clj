(ns app.project.geekarna
  (:require
   [clojure.string :as str]
   [clojure.java.io]
   [app.project :as p]))

(def ^:private games-list-url "https://www.geekarna.cz/deskovky/")

(defn- language->code [language]
  (let [lower (str/lower-case (str/trim language))]
    ({"cz" "cs"} lower lower)))

(defn- language-str->codes [language-str]
  (when language-str
    (not-empty
     (into []
           (comp
            (filter (fn [lang]
                      (<= 2 (count lang))))
            (map language->code))
           (re-seq #"\w+" language-str)))))

(defn- game->game-info [game]
  (let [[_ name languages-str] (re-matches #"(.*?)(\(.*\))?" game)
        languages (language-str->codes languages-str)]
    (cond->
     {:name (str/trim name)}
      languages (assoc :languages languages))))

(defn games []
  (mapv
   (fn [game]
     (game->game-info (.text game)))
   (.select (p/parse-html games-list-url) ".games.list h3")))
