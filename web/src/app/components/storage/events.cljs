(ns app.components.storage.events
  (:require
   [clojure.edn :as edn]
   [re-frame.core :as re-frame]
   [app.google :as google]
   [app.storage.protocols :as storage]
   [app.storage.local-storage :as local-storage]
   [app.storage.gdrive-storage :as gdrive-storage]
   [app.storage.driver.gdrive :as gdrive]))

;; local-storage
(def ^:private favorite-games-key "nenadalm.bbb-game-list/favorite-games")

;; gdrive-storage
(def ^:private favorite-games-gdrive-ns "nenadalm.bbb-game-list.storage.gdrive")

(def ^:private storage-type-key "nenadalm.bbb-game-list.storage/current")
(def ^:private request-storage-type-key "nenadalm.bbb-game-list.storage/request")

(defn- store-value [k v]
  (js/localStorage.setItem k (pr-str v)))

(defn- load-value [k default]
  (or (edn/read-string (js/localStorage.getItem k))
      default))

(defn- remove-value [k]
  (js/localStorage.removeItem k))

(defn get-storage-type []
  (load-value storage-type-key :local))

(defn- migrate-storage [old-storage new-storage]
  (storage/clear new-storage)
  (storage/add-all new-storage (storage/get-all old-storage))
  (storage/clear old-storage))

(defn- create-favorites-storage* [t]
  (case t
    :local (local-storage/create-set favorite-games-key)
    :gdrive (gdrive-storage/create-set favorite-games-gdrive-ns)
    nil))

(defn create-favorites-storage []
  (let [storage-name (get-storage-type)
        new-storage-name (load-value request-storage-type-key nil)
        storage (create-favorites-storage* storage-name)
        new-storage (if (= storage-name new-storage-name)
                      nil
                      (create-favorites-storage* new-storage-name))]
    (when new-storage
      (migrate-storage
       storage
       new-storage)
      (when (= :google storage-name)
        (google/disconnect))
      (store-value storage-type-key new-storage-name)
      (remove-value request-storage-type-key))
    (or new-storage storage)))

(defn accept-auth-response []
  (case (let [url (js/URL. js/location.href)
              params (.-searchParams url)]
          (.get params "auth_response"))
    "google" (let [params (js/URLSearchParams. js/location.search)]
               (-> (google/set-tokens-from-code (.get params "code"))
                   (.then (fn []
                            (store-value request-storage-type-key :gdrive)
                            (set! (.-href js/location) (.-url (js/JSON.parse (.get params "state"))))))))
    nil))

(defn request-storage-type [v]
  (store-value request-storage-type-key v)
  (case v
    :google (set! (.-href js/location) (gdrive/get-login-url))
    (js/window.location.reload)))

(defn- run-last-async
  "Returns function with same signature as `f` that is permitted to run at most one at a time.
  `f` needs to return promise."
  [f]
  (let [a-running #js [false]
        a-args #js [nil]
        run (fn run []
              (when-not (aget a-running 0)
                (when-let [args (aget a-args 0)]
                  (aset a-args 0 nil)
                  (aset a-running 0 true)
                  (-> (apply f args)
                      (.finally (fn [_]
                                  (aset a-running 0 false)
                                  (run)))))))]
    (fn [& args]
      (aset a-args 0 (or args []))
      (run))))

(def ^:private sync-storage
  (run-last-async
   (fn [{:keys [storage on-success]}]
     (-> (storage/sync storage)
         (.then (fn [_]
                  (re-frame/dispatch on-success)))))))

(re-frame/reg-fx
 ::sync
 (fn [options]
   (when (and js/navigator.onLine
              (google/connected?))
     (sync-storage options))))
