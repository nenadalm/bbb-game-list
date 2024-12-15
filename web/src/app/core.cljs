(ns app.core
  (:require
   [app.config :as config]
   [app.components.storage.events :as storage-events]))

(defn register-worker []
  (some-> js/navigator
          .-serviceWorker
          (.register "worker.js")))

(defn- dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn- prod-setup []
  (when-not config/debug?
    (register-worker)))

(defn ^:export init []
  (storage-events/accept-auth-response)
  (dev-setup)
  (prod-setup))
