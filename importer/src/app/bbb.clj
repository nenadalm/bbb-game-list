(ns app.bbb
  (:require
   [clojure.string]
   [app.url :as url])
  (:import
   [org.jsoup Jsoup]))

(def ^:private games-list-url "http://bohemiaboardsandbrews.com/games/")

(defn- doc->game-lists [doc]
  (rest (.select doc ".single_gl")))

(defn- game->name [game]
  (->> (.text game)
       clojure.string/trim))

(defn- game-list->game-names [game-list]
  (->> (map game->name (.textNodes game-list))
       (filter seq)))

(defn parse-languages [s]
  (map (comp clojure.string/lower-case clojure.string/trim)
       (clojure.string/split s #",")))

(defn game-name->game-info [name]
  (if-let [groups (re-find (re-matcher #"^(?<name>.+?)(?: \((?<languages>[^\)]+)\))?$" name))]
    (let [[_ pre-parsed-name languages] groups
          parsed-name (clojure.string/trim (re-find (re-matcher #"^[^\(]+" pre-parsed-name)))]
      (cond-> {:com.bohemiaboardsandbrews/name name
               :name parsed-name}
        languages (assoc :languages (parse-languages languages))))
    (throw (ex-info "Cannot parse game." {:name name}))))

(defn- game-list-doc []
  (with-open [xin (url/->cached-stream (java.net.URL. games-list-url))]
    (Jsoup/parse xin "utf-8" games-list-url)))

(defn games []
  (->> (game-list-doc)
       doc->game-lists
       (mapcat game-list->game-names)
       (map game-name->game-info)))

(comment
  (game-name->game-info "Game of Thrones: Oathbreaker (EN)")
;; => {:com.bohemia-boards-and-brews/name
;;     "Game of Thrones: Oathbreaker (EN)",
;;     :name "Game of Thrones: Oathbreaker",
;;     :languages ("en")}  
  (game-name->game-info "Game of Thrones: Oathbreaker")
;; => {:com.bohemia-boards-and-brews/name "Game of Thrones: Oathbreaker",
;;     :name "Game of Thrones: Oathbreaker"}  
  (game-name->game-info "Penguins (tucnaci) (CZ)")
;; => {:com.bohemia-boards-and-brews/name "Penguins (tucnaci) (CZ)",
;;     :name "Penguins",
;;     :languages ("cz")}
  )

