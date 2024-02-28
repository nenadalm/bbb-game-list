(ns app.events
  (:require
   [re-frame.core :as re-frame]
   [clojure.edn :as edn]
   [nenadalm.clojure-utils.re-frame.local-storage :as ls]))

(def ^:private settings-key "nenadalm.bbb-game-list/settings")

(def ^:private default-settings
  {:view :table})

;; `features`
;; - `:app.filter/new` - filter showing only new games
(re-frame/reg-event-fx
 ::init
 [(re-frame/inject-cofx ::ls/get {:settings settings-key})]
 (fn [{:keys [db settings]} [_ game-data features]]
   {:db (merge db
               game-data
               {:app/sort-key :game/name
                :app/sort-dir :asc
                :app/features (into #{} features)
                :settings (merge default-settings (edn/read-string settings))})}))

(re-frame/reg-event-db
 ::sort-by
 (fn [db [_ key dir]]
   (assoc db
          :app/sort-key key
          :app/sort-dir dir)))

(re-frame/reg-event-db
 ::show-only-new
 (fn [db [_ only-new]]
   (assoc db
          :app.filter/only-new only-new)))

(re-frame/reg-event-fx
 ::set-view
 (fn [{:keys [db]} [_ v]]
   (let [new-db (assoc-in db [:settings :view] v)]
     {:db new-db
      ::ls/set {settings-key (pr-str (:settings new-db))}})))
