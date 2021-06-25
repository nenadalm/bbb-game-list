(ns app.bgg
  (:require
   [clojure.java.io]
   [clojure.xml]
   [app.url :as url]))

(def ^:private api-root "https://www.boardgamegeek.com/xmlapi2")

(defn- search-game-url [name]
  (clojure.java.io/as-url (str api-root
                               "/search?exact=1&type=boardgame&query="
                               (java.net.URLEncoder/encode name))))

(defn- search-game-non-exact-url [name]
  (clojure.java.io/as-url (str api-root
                               "/search?exact=0&type=boardgame&query="
                               (java.net.URLEncoder/encode name))))

(defn- game-details-url [game-id]
  (clojure.java.io/as-url (str api-root
                               "/thing?type=boardgame&id="
                               game-id)))

(defn- results-count [response]
  (Integer/valueOf (get-in response [:attrs :total])))

(defn- search-game-exact [name]
  (let [url (search-game-url name)]
    (with-open [xin (url/->cached-stream url)]
      (clojure.xml/parse xin))))

(defn- search-game-non-exact [name]
  (let [url (search-game-non-exact-url name)]
    (with-open [xin (url/->cached-stream url)]
      (clojure.xml/parse xin))))

(defn- one-game-result [result]
  (when (= 1 (results-count result))
    result))

(defn- some-game-result [result]
  (when (< 0 (results-count result))
    result))

(def ^:private name-fixers
  [#(clojure.string/replace % " and " " & ")
   #(clojure.string/replace % "’" "'")])

(defn- possible-names [name]
  (let [fixed-names (into #{} (map #(% name)) name-fixers)]
    (into [name] (disj fixed-names name))))

(defn search-game [name]
  (or
   (first
    (into
     []
     (comp
      (keep #(some-game-result (search-game-exact %)))
      (take 1))
     (possible-names name)))
   (some-game-result (search-game-exact name))
   (one-game-result (search-game-non-exact name))))

(defn game-details [game-id]
  (let [url (game-details-url game-id)]
    (with-open [xin (url/->cached-stream url)]
      (clojure.xml/parse xin))))
