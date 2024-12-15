(ns app.events
  (:require
   [re-frame.core :as re-frame]
   [clojure.edn :as edn]
   [nenadalm.clojure-utils.re-frame.local-storage :as ls]
   [app.storage.protocols :as storage]
   [app.components.storage.events :as storage-events]))

(def ^:private settings-key "nenadalm.bbb-game-list/settings")

(def ^:private default-settings
  {:view :table})

(def ^:private favorites-storage (storage-events/create-favorites-storage))

(re-frame/reg-event-fx
 ::load-favorites
 (fn [{:keys [db]} _]
   {:db (assoc db
               :favorite-games (storage/get-all favorites-storage))}))

(re-frame/reg-event-fx
 ::init
 [(re-frame/inject-cofx ::ls/get {:settings settings-key})]
 (fn [{:keys [db settings]} [_ game-data features]]
   {:db (merge db
               game-data
               {:app/sort-key :game/name
                :app/sort-dir :asc
                :app/features (into #{} features)
                :settings (merge default-settings (edn/read-string settings))
                :favorite-games (storage/get-all favorites-storage)})
    :fx [[::storage-events/sync {:storage favorites-storage :on-success [::load-favorites]}]]}))

(re-frame/reg-event-db
 ::sort-by
 (fn [db [_ key dir]]
   (assoc db
          :app/sort-key key
          :app/sort-dir dir)))

(re-frame/reg-event-db
 ::show-only-favorites
 (fn [db [_ only-favorites]]
   (assoc db
          :app.filter/only-favorites only-favorites)))

(re-frame/reg-event-fx
 ::set-view
 (fn [{:keys [db]} [_ v]]
   (let [new-db (assoc-in db [:settings :view] v)]
     {:db new-db
      ::ls/set {settings-key (pr-str (:settings new-db))}})))

(re-frame/reg-event-fx
 ::add-favorite-game
 (fn [{:keys [db]} [_ v]]
   {:db (assoc db :favorite-games (storage/add-item favorites-storage v))
    :fx [[::storage-events/sync {:storage favorites-storage :on-success [::load-favorites]}]]}))

(re-frame/reg-event-fx
 ::remove-favorite-game
 (fn [{:keys [db]} [_ v]]
   {:db (assoc db :favorite-games (storage/remove-item favorites-storage v))
    :fx [[::storage-events/sync {:storage favorites-storage :on-success [::load-favorites]}]]}))
