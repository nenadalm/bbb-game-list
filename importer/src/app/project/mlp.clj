(ns app.project.mlp
  (:require
   [clojure.java.io]
   [app.project :as p]))

(def ^:private request-cookie-url "https://search.mlp.cz/cz/#/c_s_ol=")
(def ^:private games-list-url "https://search.mlp.cz/cz/?action=c_s_ol&navigation=%2Bngeneric4%3A%5E%22hra%22%24n%24%20%2Bngeneric7%3A%5E%22P%22%24n%24")

(defn- doc->game-list [doc]
  (.select doc "#katalog-list .titul"))

(defn- game->game-info [game]
  {:name (.text (.select game "a[itemprop=name]"))})

(defn games []
  (let [cookie (p/get-cookie request-cookie-url)]
    (loop [offset 0
           games []]
      (let [url (str games-list-url "&offset=" offset)
            games* (mapv game->game-info (doc->game-list (p/parse-html cookie url)))
            cnt (count games*)]
        (if (< 0 cnt)
          (recur (+ cnt offset) (into games games*))
          games)))))
