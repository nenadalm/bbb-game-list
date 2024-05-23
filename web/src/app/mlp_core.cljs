(ns app.mlp-core
  (:require
   [re-frame.core :as re-frame]
   [reagent.dom :as reagent-dom]
   [app.config :as config]
   [app.views :as views]
   [app.events :as events]
   [app.mlp-data :as data]))

(defn- dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent-dom/render [views/app {:source-label "mlp.cz"
                                  :source-url "https://search.mlp.cz/cz/?query=&kde=all#/c_s_ol=kde-eq:all-amp:query-eq:-amp:navigation-eq:%2Bngeneric4%3A%5E%22hra%22%24n%24%20%2Bngeneric7%3A%5E%22P%22%24n%24"}]
                      (.getElementById js/document "app")))

(defn ^:export init []
  (dev-setup)
  (re-frame/dispatch-sync [::events/init data/game-data])
  (mount-root))

(defn ^:dev/after-load after-load []
  (mount-root))
