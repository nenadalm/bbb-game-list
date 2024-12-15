(ns app.components.storage.views
  (:require
   [app.google :as google]
   [app.storage.driver.gdrive :as gdrive]
   [app.components.storage.events :as storage-events]))

(defn selector []
  (let [storage-type (storage-events/get-storage-type)]
    [:div
     [:label
      "Storage: "
      [:select
       {:defaultValue (name storage-type)
        :on-change (fn [^js e]
                     (storage-events/request-storage-type (keyword (.-currentTarget.value e))))}
       [:option
        {:value "local"}
        "Local"]
       [:option
        {:value "gdrive"}
        "GDrive"]]]
     (when (and (= :gdrive storage-type)
                js/navigator.onLine
                (not (google/connected?)))
       [:a
        {:href (gdrive/get-login-url)}
        "Connect"])]))
