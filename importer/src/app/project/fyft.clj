(ns app.project.fyft
  (:require
   [clojure.string :as str]
   [clojure.java.io])
  (:import
   [org.jsoup Jsoup]))

(def ^:private games-list-url "https://www.fyft.cz/fyft-herna-praha-holesovice/")

(defn- game-list-doc []
  (with-open [xin (clojure.java.io/input-stream (java.net.URL. games-list-url))]
    (Jsoup/parse xin "utf-8" games-list-url)))

(defn- language->code [language]
  (let [lower (str/lower-case (str/trim language))]
    ({"cz" "cs"} lower lower)))

(defn- game->game-info [game]
  (let [[name language] (str/split game #"-")]
    (cond->
     {:name (str/trim name)}
      language (assoc :languages [(language->code language)]))))

(defn games []
  (into
   []
   (comp
    (map (fn [td]
           (.wholeText td)))
    (mapcat (fn [s]
              (str/split-lines s)))
    (filter (fn [line]
              (and (< 1 (count line))
                   (not= "V + W" line))))
    (map game->game-info))
   (.select (game-list-doc) "table td")))
