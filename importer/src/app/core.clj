(ns app.core
  (:require
   [app.bbb :as bbb]
   [app.bbg :as bbg])
  (:import
   [org.jsoup Jsoup]))

(defn- tap [x]
  (binding [*out* *err*]
    (println x)))

(add-tap tap)

(defn- game-id [search-result]
  (get-in search-result [:content 0 :attrs :id]))

(defn- add-game-details [game item]
  (case (:tag item)
    :thumbnail (assoc game :com.boardgamegeek.boardgame/thumbnail (-> item :content first))
    :minplayers (assoc game :com.boardgamegeek.boardgame/min-players (Integer/valueOf (-> item :attrs :value)))
    :maxplayers (assoc game :com.boardgamegeek.boardgame/max-players (Integer/valueOf (-> item :attrs :value)))
    :name (if (= (-> item :attrs :type) "primary")
            (assoc game :com.boardgamegeek.boardgame/name (-> item :attrs :value))
            game)
    game))

(defn- enrich-games-with-id [games]
  (map (fn [game-info]
         (let [found (bbg/search-game (:name game-info))
               id (game-id found)]
           (cond-> game-info
             id (assoc :com.boardgamegeek.boardgame/id id))))
       games))

(defn- enrich-games-with-bbg-info [games]
  (map (fn [game]
         (if-let [game-id (:com.boardgamegeek.boardgame/id game)]
           (let [response (bbg/game-details game-id)
                 details (get-in response [:content 0 :content])]
             (reduce
              add-game-details
              game
              details))
           game))
       games))

(defn- bbb-games []
  (-> (bbb/games)
      enrich-games-with-id
      enrich-games-with-bbg-info))

(defn -main [& args]
  (prn (bbb-games)))
