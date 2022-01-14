(ns app.events
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-event-db
 ::init
 (fn [db [_ game-data]]
   (merge db
          game-data
          {:app/sort-key :game/name
           :app/sort-dir :asc})))

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
