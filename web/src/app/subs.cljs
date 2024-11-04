(ns app.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::base-games
 (fn [db _]
   (:game-list/games db)))

(re-frame/reg-sub
 ::favorite-games
 (fn [db _]
   (:favorite-games db)))

(re-frame/reg-sub
 ::games
 (fn [_]
   [(re-frame/subscribe [::base-games])
    (re-frame/subscribe [::favorite-games])])
 (fn [[games favorite-games] _]
   (reduce-kv
    (fn [m k v]
      (if (contains? favorite-games (:com.boardgamegeek.boardgame/id v))
        (assoc m k (assoc v :favorite true))
        m))
    games
    games)))

(re-frame/reg-sub
 ::games-list-options
 (fn [db _]
   (let [sort-key (:app/sort-key db)]
     {:sort-dir (:app/sort-dir db)
      :sorting (get-in db [:game-list/sorting sort-key])
      :only-favorites (:app.filter/only-favorites db)})))

(re-frame/reg-sub
 ::game-list
 (fn [_]
   [(re-frame/subscribe [::games])
    (re-frame/subscribe [::games-list-options])])
 (fn [[games games-list-options] _]
   (let [{:keys [sort-dir sorting only-favorites]} games-list-options
         asc-ordered-ids sorting
         ordered-ids (if (= :asc sort-dir)
                       asc-ordered-ids
                       (rseq asc-ordered-ids))
         filter-f (if only-favorites :favorite (constantly true))]
     (if ordered-ids
       (reduce
        (fn [sorted-list next-game-id]
          (let [game (games next-game-id)]
            (if (filter-f game)
              (conj sorted-list game)
              sorted-list)))
        []
        ordered-ids)
       (do
         (.error js/console "Cannot sort games properly.")
         (vals games))))))

(re-frame/reg-sub
 ::sorting
 (fn [db _]
   (select-keys db [:app/sort-dir :app/sort-key])))

(re-frame/reg-sub
 ::view
 (fn [db _]
   (get-in db [:settings :view])))
