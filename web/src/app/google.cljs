(ns app.google
  (:require
   [clojure.edn :as edn]
   [app.storage.driver.gdrive :as gdrive]))

(def ^:private tokens-key "nenadalm.bbb-game-list.google/tokens")

(defn- time-in-seconds [seconds]
  (let [date (js/Date.)]
    (.setSeconds date (+ (.getSeconds date) seconds))
    (.getTime date)))

(defn- get-tokens []
  (or
   (some-> (js/localStorage.getItem tokens-key)
           edn/read-string)
   nil))

(defn connected? []
  (some? (get-tokens)))

(defn disconnect []
  (js/localStorage.removeItem tokens-key))

(defn- set-tokens [tokens]
  (js/localStorage.setItem tokens-key (pr-str tokens)))

(defn set-tokens-from-code [code]
  (-> (gdrive/code->tokens code)
      (.then (fn [tokens-response]
               (set-tokens {:refresh-token (:refresh_token tokens-response)
                            :access-token (:access_token tokens-response)
                            :expires-in (time-in-seconds (:expires_in tokens-response))})))))

(defn get-access-token []
  (let [tokens (get-tokens)
        now (.getTime (js/Date.))]
    (if (and (:access-token tokens) (< (+ 5000 now) (:expires-in tokens)))
      (js/Promise.resolve (:access-token tokens))
      (-> (gdrive/access-token (:refresh-token tokens))
          (.then (fn [tokens-response]
                   (set-tokens
                    (assoc tokens
                           :access-token (:access_token tokens-response)
                           :expires-in (time-in-seconds (:expires_in tokens-response))))))))))
