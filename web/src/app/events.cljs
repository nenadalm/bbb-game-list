(ns app.events
  (:require
   [re-frame.core :as re-frame]
   [clojure.edn :as edn]
   [nenadalm.clojure-utils.re-frame.local-storage :as ls]))

(def ^:private settings-key "nenadalm.bbb-game-list/settings")
(def ^:private favorite-games-key "nenadalm.bbb-game-list/favorite-games")

(def ^:private default-settings
  {:view :table})

(re-frame/reg-event-fx
 ::init
 [(re-frame/inject-cofx ::ls/get {:settings settings-key})
  (re-frame/inject-cofx ::ls/get {:favorite-games favorite-games-key})]
 (fn [{:keys [db settings favorite-games]} [_ game-data features]]
   {:db (merge db
               game-data
               {:app/sort-key :game/name
                :app/sort-dir :asc
                :app/features (into #{} features)
                :settings (merge default-settings (edn/read-string settings))
                :favorite-games (into #{} (edn/read-string favorite-games))})}))

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
   (let [new-db (update db :favorite-games conj v)]
     {:db new-db
      ::ls/set {favorite-games-key (pr-str (:favorite-games new-db))}})))

(re-frame/reg-event-fx
 ::remove-favorite-game
 (fn [{:keys [db]} [_ v]]
   (let [new-db (update db :favorite-games disj v)]
     {:db new-db
      ::ls/set {favorite-games-key (pr-str (:favorite-games new-db))}})))
