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

(defn search-game [name]
  (let [exact (search-game-exact name)]
    (if (= 0 (results-count exact))
      (let [non-exact (search-game-non-exact name)]
        (if (= 1 (results-count non-exact))
          non-exact
          exact))
      exact)))

(defn game-details [game-id]
  (let [url (game-details-url game-id)]
    (with-open [xin (url/->cached-stream url)]
      (clojure.xml/parse xin))))
