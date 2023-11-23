(ns app.tg
  (:require
   [clojure.string :as str]
   [clojure.java.io]
   [jsonista.core :as j])
  (:import
   [org.jsoup Jsoup]))

(def ^:private games-list-url "https://www.tlamagames.com/pujcovna/")

(defn- game-list-doc [url]
  (with-open [xin (clojure.java.io/input-stream (java.net.URL. url))]
    (Jsoup/parse xin "utf-8" url)))

(defn- doc->next-page [doc]
  (not-empty (.attr (.select doc ".next.pagination-link") "abs:href")))

(defn- doc->game-list [doc]
  (.select doc ".products-page > .product"))

(defn- game->game-info [game parameters]
  (let [sku (.text (.select game "span[data-micro=sku]"))
        bgg-id (str (get-in parameters [sku "bgg_id"]))]
    {:name (str/trim (str/replace (.text (.select game ".name > span")) "(půjčovna)" ""))
     :com.boardgamegeek.boardgame/id bgg-id}))

(defn- get-parameters []
  (get (j/read-value (java.net.URL. "https://tlama.fvstudio.cz/api/product/parameters")) "list"))

(defn games []
  (let [parameters (get-parameters)]
    (loop [url games-list-url
           futures []]
      (if url
        (let [doc (game-list-doc url)]
          (recur (doc->next-page doc)
                 (conj futures (future (pmap #(game->game-info % parameters) (doc->game-list doc))))))
        (into [] (mapcat deref) futures)))))
