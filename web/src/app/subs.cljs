(ns app.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::game-list
 (fn [db _]
   (let [sort-key (:app/sort-key db)
         sort-dir (:app/sort-dir db)
         asc-ordered-ids (get-in db [:game-list/sorting sort-key])
         ordered-ids (if (= :asc sort-dir)
                       asc-ordered-ids
                       (rseq asc-ordered-ids))
         games (:game-list/games db)]
     (if ordered-ids
       (reduce
        (fn [sorted-list next-game-id]
          (conj sorted-list (games next-game-id)))
        []
        ordered-ids)
       (do
         (.error js/console "Cannot sort games properly.")
         (vals games))))))

(re-frame/reg-sub
 ::sorting
 (fn [db _]
   (select-keys db [:app/sort-dir :app/sort-key])))
