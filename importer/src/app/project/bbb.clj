(ns app.project.bbb
  (:require
   [clojure.string]
   [clojure.java.io]
   [app.project :as p]))

(def ^:private games-list-url "https://www.bohemiaboardsandbrews.com/knihovna-her")

(def ^:private language->code
  {"/game-languages/cestina" "cs"
   "/game-languages/english" "en"
   "/game-languages/french" "fr"
   "/game-languages/german" "de"
   "/game-languages/russian" "ru"})

(defn- doc->next-page [doc]
  (when-let [href (not-empty (.attr (.select doc ".w-pagination-next") "href"))]
    (str games-list-url href)))

(defn- doc->game-list [doc]
  (.select doc ".collection_list-games > div"))

(defn- game->name [game]
  (-> game
      (.select ".heading-style-h4")
      first
      (.text)
      clojure.string/trim))

(defn- game->id [game]
  (let [href (-> game
                 (.select ".content-card")
                 (.attr "href"))]
    (second (re-find #"/(\d+)/" href))))

(defn- game->languages [game]
  (let [additional-info-url (.attr (.first (.select game "a.hide")) "abs:href")
        info-doc (p/parse-html additional-info-url)]
    (into
     []
     (map (fn [el]
            (let [language (.attr el "href")]
              (language->code language language))))
     (.select info-doc "[fs-cmsnest-collection=languages] a"))))

(defn- game->game-info [game]
  (let [languages (not-empty (game->languages game))]
    (cond->
     {:name (game->name game)
      :com.boardgamegeek.boardgame/id (game->id game)}
      languages (assoc :languages languages))))

(defn games []
  (loop [url games-list-url
         futures []]
    (if url
      (let [doc (p/parse-html url)]
        (recur (doc->next-page doc)
               (conj futures (future (pmap game->game-info (doc->game-list doc))))))
      (into [] (mapcat deref) futures))))
