(ns app.views
  (:require
   [re-frame.core :as re-frame]
   [goog.string :refer [unescapeEntities]]
   [app.subs :as subsc]
   [app.events :as events]
   [app.components.icons.views :as i]))

(defn- min-players [data]
  (:com.boardgamegeek.boardgame/min-players data))

(defn- max-players [data]
  (:com.boardgamegeek.boardgame/max-players data))

(defn- min-play-time [data]
  (when-let [x (:com.boardgamegeek.boardgame/min-play-time data)]
    (str x " min.")))

(defn- max-play-time [data]
  (when-let [x (:com.boardgamegeek.boardgame/max-play-time data)]
    (str x " min.")))

(defn- thumbnail [data]
  (when-let [thumbnail (:com.boardgamegeek.boardgame/thumbnail data)]
    [:img {:src thumbnail}]))

(defn- languages [data]
  (when-let [languages (:languages data)]
    (into [:<> "Languages: "]
          (interpose (unescapeEntities "&nbsp;")
                     (map (fn [lang]
                            [i/language lang])
                          languages)))))

(defn- title [data]
  (if-let [bbg-title (:com.boardgamegeek.boardgame/name data)]
    [:a {:href (str "https://boardgamegeek.com/boardgame/" (:com.boardgamegeek.boardgame/id data))}
     bbg-title]
    (:name data)))

(defn- game [data]
  [:tr
   [:td
    [thumbnail data]]
   [:td
    [title data]
    [:br]
    [:br]
    [languages data]]
   [:td
    [min-players data]]
   [:td
    [max-players data]]
   [:td
    [min-play-time data]]
   [:td
    [max-play-time data]]])

(defn sortable-th [{:keys [text key sorting]}]
  (let [current-key-sorted (= key (:app/sort-key sorting))
        next-dir (if current-key-sorted
                   ({:asc :desc :desc :asc} (:app/sort-dir sorting))
                   :asc)
        icon (if current-key-sorted
               (if (= (:app/sort-dir sorting) :asc)
                 [i/arrow-up]
                 [i/arrow-down])
               nil)]
    [:th.pointer
     {:on-click #(re-frame/dispatch [::events/sort-by key next-dir])}
     text
     icon]))

(defn game-list []
  (let [sorting @(re-frame/subscribe [::subsc/sorting])]
    [:table
     [:thead
      [:tr
       [:th]
       [sortable-th {:text "Title"
                     :key :game/name
                     :sorting sorting}]
       [sortable-th {:text "Min players"
                     :key :com.boardgamegeek.boardgame/min-players
                     :sorting sorting}]
       [sortable-th {:text "Max players"
                     :key :com.boardgamegeek.boardgame/max-players
                     :sorting sorting}]
       [sortable-th {:text "Min playing time"
                     :key :com.boardgamegeek.boardgame/min-play-time
                     :sorting sorting}]
       [sortable-th {:text "Max playing time"
                     :key :com.boardgamegeek.boardgame/max-play-time
                     :sorting sorting}]]]
     [:tbody
      (for [g @(re-frame/subscribe [::subsc/game-list])]
        ^{:key (:com.bohemiaboardsandbrews/name g)} [game g])]]))

(defn app []
  [:<>
   [game-list]
   [:div.footer
    "Listed games are taken from "
    [:a {:href "http://bohemiaboardsandbrews.com/games/"} "bohemiaboardsandbrews.com"]
    " enriched with info from "
    [:a {:href "https://boardgamegeek.com/"} "boardgamegeek.com"]
    "."]])
