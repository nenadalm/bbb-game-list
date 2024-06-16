(ns app.mlp
  (:require
   [clojure.java.io])
  (:import
   [org.jsoup Jsoup]))

(def ^:private request-cookie-url "https://search.mlp.cz/cz/#/c_s_ol=")
(def ^:private games-list-url "https://search.mlp.cz/cz/?action=c_s_ol&navigation=%2Bngeneric4%3A%5E%22hra%22%24n%24%20%2Bngeneric7%3A%5E%22P%22%24n%24")

(defn- get-cookie []
  (let [url (java.net.URL. request-cookie-url)
        conn (.openConnection url)]
    (.getHeaderField conn "Set-Cookie")))

(defn- game-list-doc [cookie url]
  (let [conn (.openConnection (java.net.URL. url))]
    (.setRequestProperty conn "Cookie" cookie)
    (.connect conn)
    (with-open [xin (.getInputStream conn)]
      (Jsoup/parse xin "utf-8" url))))

(defn- doc->game-list [doc]
  (.select doc "#katalog-list .titul"))

(defn- game->game-info [game]
  {:name (.text (.select game "a[itemprop=name]"))})

(defn games []
  (let [cookie (get-cookie)]
    (loop [offset 0
           games []]
      (let [url (str games-list-url "&offset=" offset)
            games* (mapv game->game-info (doc->game-list (game-list-doc cookie url)))
            cnt (count games*)]
        (if (< 0 cnt)
          (recur (+ cnt offset) (into games games*))
          games)))))
