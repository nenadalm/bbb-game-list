(ns app.project.deskohub
  (:require
   [buddy.sign.jwt :as jwt]
   [buddy.core.keys :as bkeys]
   [jsonista.core :as j]
   [app.http.url :as http]))

(def ^:private service-account
  {:email (System/getenv "GOOGLE_SERVICE_ACCOUNT_EMAIL")
   :key (System/getenv "GOOGLE_SERVICE_ACCOUNT_KEY")})

(defn- create-jwt-token []
  (jwt/sign
   {:iss (:email service-account)
    :scope "https://www.googleapis.com/auth/spreadsheets.readonly"
    :exp (.plusSeconds (java.time.Instant/now) 3600)
    :iat (java.time.Instant/now)
    :aud "https://oauth2.googleapis.com/token"}
   (bkeys/str->private-key (:key service-account))
   {:alg :rs256}))

(defn- get-access-token []
  (-> (http/request
       {:url "https://oauth2.googleapis.com/token"
        :method "POST"
        :headers {"Content-Type" "application/x-www-form-urlencoded"}
        :body (http/->query-string
               {:grant_type "urn:ietf:params:oauth:grant-type:jwt-bearer"
                :assertion (create-jwt-token)})
        :throw-on-error true})
      :body
      (j/read-value j/keyword-keys-object-mapper)
      :access_token))

(defn- fetch-data []
  (-> (http/request
       {:url "https://sheets.googleapis.com/v4/spreadsheets/1COMEk06pF2a1gqVaFvrH0PspCA0W5kyfbMGqD3vVCS8/values:batchGet?ranges=A2:A&ranges=F2:F"
        :headers {"Authorization" (str "Bearer " (get-access-token))}
        :throw-on-error true})
      :body
      (j/read-value j/keyword-keys-object-mapper)
      :valueRanges))

(defn- connect-rows [data]
  (->> data
       (mapv :values)
       (apply interleave)
       (partition-all 2)))

(defn- bgg-url->bgg-id [url]
  (when url
    (second (re-find #"/(\d+)/" url))))

(defn games []
  (->> (fetch-data)
       connect-rows
       (mapv (fn [[[game-name] [bgg-url]]]
               (let [bgg-id (bgg-url->bgg-id bgg-url)]
                 (cond-> {:name game-name}
                   bgg-id (assoc :com.boardgamegeek.boardgame/id bgg-id)))))))
