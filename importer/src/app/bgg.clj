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

(defn- game-details-url [game-id]
  (clojure.java.io/as-url (str api-root
                               "/thing?type=boardgame&id="
                               game-id)))

(defn search-game [name]
  (let [url (search-game-url name)]
    (with-open [xin (url/->cached-stream url)]
      (clojure.xml/parse xin))))

(defn game-details [game-id]
  (let [url (game-details-url game-id)]
    (with-open [xin (url/->cached-stream url)]
      (clojure.xml/parse xin))))
