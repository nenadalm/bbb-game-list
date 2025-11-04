(ns app.core
  (:require
   [app.config :as config]
   [app.components.storage.events :as storage-events]))

(defn- update-available []
  (when-let [el (js/document.getElementById "update-available")]
    (set! (.-style el) "display: inline;")))

(defn register-worker []
  (some-> js/navigator
          .-serviceWorker
          (.register "worker.js")
          (.then
           (fn [registration]
             (if (and (.-waiting registration)
                      js/navigator.serviceWorker.controller)
               (update-available)
               (.addEventListener
                registration
                "updatefound"
                (fn []
                  (when-let [installing (.-installing registration)]
                    (.addEventListener
                     installing
                     "statechange"
                     (fn []
                       (when (and (.-waiting registration)
                                  js/navigator.serviceWorker.controller)
                         (update-available))))))))))))

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
