(ns app.mp
  (:require
   [clojure.string]
   [clojure.java.io])
  (:import
   [org.jsoup Jsoup]))

(def ^:private games-list-url "https://www.manapotion.cz/na%C5%A1e-hry")

(defn- game->name [game]
  (->> (.text game)
       clojure.string/trim))

(defn- game-list->game-names [game-list]
  (into
   []
   (comp
    (map game->name)
    (filter seq))
   (.select game-list ".wixui-repeater__item [data-testid=richTextElement]:first-child")))

(defn- game-list-doc []
  (with-open [xin (clojure.java.io/input-stream (java.net.URL. games-list-url))]
    (Jsoup/parse xin "utf-8" games-list-url)))

(defn games []
  (let [game-names (->> (game-list-doc)
                        game-list->game-names)]
    (mapv
     (fn [game-name]
       {:name game-name
        :cz.manapotion/name game-name})
     game-names)))
