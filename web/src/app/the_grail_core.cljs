(ns app.the-grail-core
  (:require
   [re-frame.core :as re-frame]
   [reagent.dom :as reagent-dom]
   [app.config :as config]
   [app.views :as views]
   [app.events :as events]
   [app.the-grail-data :as data]))

(defn- dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent-dom/render [views/app {:source-label "thegrail.cz"
                                  :source-url "https://www.thegrail.cz/#nabidka_her"}]
                      (.getElementById js/document "app")))

(defn ^:export init []
  (dev-setup)
  (re-frame/dispatch-sync [::events/init data/game-data])
  (mount-root))

(defn ^:dev/after-load after-load []
  (mount-root))
