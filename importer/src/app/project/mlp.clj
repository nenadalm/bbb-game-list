(ns app.project.mlp
  (:require
   [clojure.java.io]
   [jsonista.core :as j]
   [app.http.url :as http]))

(def ^:private games-list-url "https://www.mlp.cz/katalog/api/titul/search?size=24&filter%5Bformat%5D%5Beq%5D=spole%C4%8Densk%C3%A1%20hra&filter%5Bdostupnost%5D%5Beq%5D=pritomne")

(defn- url->json [url]
  (let [response (http/request
                  {:url url
                   :throw-on-error true
                   :as :stream})]
    (with-open [xin (:body response)]
      (j/read-value xin j/keyword-keys-object-mapper))))

(defn- json->games [json]
  (mapv
   (fn [game]
     (when-let [name (first (get-in game [:_source :nazev]))]
       {:name name}))
   (get-in json [:hits :hits])))

(defn games []
  (loop [offset 0
         games []]
    (let [url (str games-list-url "&from=" offset)
          games* (json->games (url->json url))
          cnt (count games*)]
      (if (< 0 cnt)
        (recur (+ cnt offset) (into games games*))
        games))))
