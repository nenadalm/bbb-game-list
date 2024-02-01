(ns app.events
  (:require
   [re-frame.core :as re-frame]))

;; `features`
;; - `:app.filter/new` - filter showing only new games
(re-frame/reg-event-db
 ::init
 (fn [db [_ game-data features]]
   (merge db
          game-data
          {:app/sort-key :game/name
           :app/sort-dir :asc
           :app/features (into #{} features)})))

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

(re-frame/reg-event-db
 ::set-view
 (fn [db [_ v]]
   (assoc db :view v)))
