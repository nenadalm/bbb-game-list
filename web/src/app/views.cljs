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
    (into [:div "Languages: "]
          (interpose (unescapeEntities "&nbsp;")
                     (map (fn [lang]
                            [i/language lang])
                          languages)))))

(defn- categories [data]
  (when-let [categories (:com.boardgamegeek.boardgame/categories data)]
    (into [:div "Categories: "]
          (interpose (unescapeEntities ", ")
                     (mapv (fn [category]
                             [:a {:href (str "https://boardgamegeek.com/boardgamecategory/"
                                             (:com.boardgamegeek.category/id category))}
                              (:com.boardgamegeek.category/name category)])
                           categories)))))

(defn- mechanics [data]
  (when-let [mechanics (:com.boardgamegeek.boardgame/mechanics data)]
    (into [:div "Mechanics: "]
          (interpose (unescapeEntities ", ")
                     (mapv (fn [mechanic]
                             [:a {:href (str "https://boardgamegeek.com/boardgamemechanic/"
                                             (:com.boardgamegeek.mechanic/id mechanic))}
                              (:com.boardgamegeek.mechanic/name mechanic)])
                           mechanics)))))

(defn- title [data]
  (if-let [bgg-id (:com.boardgamegeek.boardgame/id data)]
    [:<>
     [:a {:href (str "https://boardgamegeek.com/boardgame/" bgg-id)}
      (:game/name data)]
     (when (:new data)
       [:sup "new"])
     (when-not (= (:game/name data) (:name data))
       [:<>
        [:br]
        "(" (:name data) ")"])]
    [:<>
     (:game/name data)
     (when (:new data)
       [:sup "new"])]))

(defn- rating [game]
  (when-let [rating (:com.boardgamegeek.boardgame/rating game)]
    [:<>
     "Rating: " rating
     [:br]]))

(defn- game [data]
  [:tr
   [:td
    [thumbnail data]]
   [:td
    [title data]
    [:br]
    [:br]
    [languages data]
    [categories data]
    [mechanics data]]
   [:td
    (:com.boardgamegeek.boardgame/rating data)]
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
  (let [sorting @(re-frame/subscribe [::subsc/sorting])
        filter-new-enabled @(re-frame/subscribe [::subsc/feature-enabled :app.filter/new])]
    [:table.game-list
     [:thead
      [:tr
       [:th
        (when filter-new-enabled
          [:label [:input {:type "checkbox"
                           :on-change #(re-frame/dispatch [::events/show-only-new (.-target.checked ^js %)])}] "only new"])]
       [sortable-th {:text "Title"
                     :key :game/name
                     :sorting sorting}]
       [sortable-th {:text "Rating"
                     :key :com.boardgamegeek.boardgame/rating
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
        ^{:key (:game/id g)} [game g])]]))

(defn- game-card [game]
  [:div.card
   [:div.card-header [title game]]
   [:div.card-content
    [:div
     [thumbnail game]]
    [:div
     [rating game]
     (let [min-players (:com.boardgamegeek.boardgame/min-players game)
           max-players (:com.boardgamegeek.boardgame/max-players game)]
       (when (and min-players max-players)
         [:<>
          "Players: " min-players " - " max-players
          [:br]]))
     (let [min-play-time (:com.boardgamegeek.boardgame/min-play-time game)
           max-play-time (:com.boardgamegeek.boardgame/max-play-time game)]
       (when (and min-play-time max-play-time)
         [:<>
          "Playing time: "
          (if (== min-play-time max-play-time)
            (str min-play-time)
            (str min-play-time " - " max-play-time))
          " min."
          [:br]]))
     [languages game]
     [categories game]
     [mechanics game]]]])

(defn- keyword->str [kw]
  (str (namespace kw) "/" (name kw)))

(defn- sort-option [{:keys [text key]}]
  [:option {:value (keyword->str key)} text])

(defn- panel []
  (let [sorting @(re-frame/subscribe [::subsc/sorting])]
    [:<>
     [:label
      "Sort by "
      [:select
       {:value (keyword->str (:app/sort-key sorting))
        :on-change (fn [^js e]
                     (let [key (keyword (.-currentTarget.value e))]
                       (re-frame/dispatch [::events/sort-by key (:app/sort-dir sorting)])))}
       [sort-option {:text "Title"
                     :key :game/name}]
       [sort-option {:text "Rating"
                     :key :com.boardgamegeek.boardgame/rating}]
       [sort-option {:text "Max players"
                     :key :com.boardgamegeek.boardgame/max-players}]
       [sort-option {:text "Min players"
                     :key :com.boardgamegeek.boardgame/min-players}]
       [sort-option {:text "Max playing time"
                     :key :com.boardgamegeek.boardgame/max-play-time}]
       [sort-option {:text "Min playing time"
                     :key :com.boardgamegeek.boardgame/min-play-time}]]]
     [:select
      {:value (name (:app/sort-dir sorting))
       :on-change (fn [^js e]
                    (re-frame/dispatch [::events/sort-by (:app/sort-key sorting) (keyword (.-currentTarget.value e))]))}
      [:option {:value "asc"} "Asc"]
      [:option {:value "desc"} "Desc"]]]))

(defn- game-list2 []
  [:div.game-list2
   [panel]
   [:div.card-list
    (for [g @(re-frame/subscribe [::subsc/game-list])]
      ^{:key (:game/id g)} [game-card g])]])

(defn- settings [view]
  (case view
    :list
    [:div.settings
     [:<>
      [:button
       {:on-click #(re-frame/dispatch [::events/set-view :table])}
       "Show table"]]]
    :table
    [:div.settings
     [:<>
      [:button
       {:on-click #(re-frame/dispatch [::events/set-view :list])}
       "Show list"]]]))

(def ^:private
  view->component
  {:list game-list2
   :table game-list})

(defn app [{:keys [source-label source-url]}]
  (let [view @(re-frame/subscribe [::subsc/view])
        component (view->component view :table)]
    [:<>
     [settings view]
     [component]
     [:div.footer
      [:p
       "You can report bugs and request new features on  "
       [:a {:href "https://github.com/nenadalm/bbb-game-list/issues/new"} "GitHub"]
       "."]
      [:p
       "Listed games are taken from "
       [:a {:href source-url} source-label]
       " enriched with info from "
       [:a {:href "https://boardgamegeek.com/"} "boardgamegeek.com"]
       "."]]]))
