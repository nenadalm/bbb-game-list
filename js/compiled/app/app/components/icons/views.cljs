(ns app.components.icons.views)

(defn arrow-up []
  [:span.i-arrow-up])

(defn arrow-down []
  [:span.i-arrow-down])

(defn language [s]
  (let [class (case s
                "cz" "i-country-cz"
                "en" "i-country-us"
                "fr" "i-country-fr"
                "pl" "i-country-pl"
                "de" "i-country-de"
                "it" "i-country-it"
                "ne" "i-country-ne"
                "ru" "i-country-ru"
                nil)]
    [:span {:class class :title s}
     (when-not class
       s)]))
