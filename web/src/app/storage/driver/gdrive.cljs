(ns app.storage.driver.gdrive
  "https://developers.google.com/drive/api/reference/rest/v3/files"
  (:require
   [clojure.edn :as edn]
   [clojure.string :as str]
   [app.storage.protocols :refer [IFile]]))

(def ^:private client-id "720826429334-od5ga7l0rdjc5tvkd09r9276gbj8asm1.apps.googleusercontent.com")
(def ^:private client-secret "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")

(defn- get-redirect-path []
  (when (str/ends-with? js/location.hostname ".github.io")
    (str/join
     "/"
     (concat
      (->> (str/split "/bbb-game-list/bbb.html" #"/")
           (take 2))
      [""]))))

(defn- get-redirect-uri []
  (str js/location.origin
       (get-redirect-path)
       "?auth_response=google"))

(defn get-login-url []
  (str "https://accounts.google.com/o/oauth2/v2/auth?"
       "client_id=" client-id
       "&redirect_uri=" (js/encodeURIComponent (get-redirect-uri))
       "&response_type=code"
       "&scope=" (js/encodeURIComponent "https://www.googleapis.com/auth/drive.appdata")
       "&access_type=offline"
       "&prompt=consent"
       "&state=" (js/JSON.stringify #js {:url js/location.href})))

(defn- throw-on-error [^js response]
  (if (.-ok response)
    response
    (throw (ex-info (str "Request to " (.-url response) " failed.") {:response {:status (.-status response)}}))))

(defn code->tokens [code]
  (-> (js/fetch
       "https://oauth2.googleapis.com/token"
       #js {:method "POST"
            :body (js/URLSearchParams.
                   #js {:code code
                        :client_id client-id
                        :client_secret client-secret
                        :redirect_uri (get-redirect-uri)
                        :grant_type "authorization_code"})})
      (.then throw-on-error)
      (.then #(.json %))
      (.then (fn [js-obj]
               (js->clj js-obj :keywordize-keys true)))))

(defn access-token [refresh-token]
  (-> (js/fetch
       "https://oauth2.googleapis.com/token"
       #js {:method "POST"
            :body (js/URLSearchParams.
                   #js {:refresh_token refresh-token
                        :client_id client-id
                        :client_secret client-secret
                        :grant_type "refresh_token"})})
      (.then throw-on-error)
      (.then #(.json %))
      (.then (fn [js-obj]
               (js->clj js-obj :keywordize-keys true)))))

(defn- create-file [access-token file-name data]
  (let [form (js/FormData.)]
    (.append form "metadata" (js/Blob.
                              #js [(js/JSON.stringify #js {:name file-name
                                                           :parents #js ["appDataFolder"]})]
                              #js {:type "application/json"}))
    (.append form "media" (js/Blob.
                           #js [(binding [*print-meta* true] (pr-str data))]
                           #js {:type "application/edn"}))
    (-> (js/fetch
         "https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart"
         #js {:method "POST"
              :headers #js {:authorization (str "Bearer " access-token)}
              :body form})
        (.then throw-on-error))))

(defn- update-file [access-token file-id data]
  (-> (js/fetch
       (str "https://www.googleapis.com/upload/drive/v3/files/" file-id "?uploadType=media")
       #js {:method "PATCH"
            :headers #js {:authorization (str "Bearer " access-token)}
            :body (js/Blob.
                   #js [(binding [*print-meta* true] (pr-str data))]
                   #js {:type "application/edn"})})
      (.then throw-on-error)))

(defn- file-id [access-token file-name]
  (-> (js/fetch
       (str "https://www.googleapis.com/drive/v3/files?spaces=appDataFolder"
            "&q=" (js/encodeURIComponent (str "name = '" file-name "'")))
       #js {:headers #js {:authorization (str "Bearer " access-token)}})
      (.then throw-on-error)
      (.then #(.json %))
      (.then (fn [js-obj]
               (get-in (js->clj js-obj :keywordize-keys true) [:files 0 :id])))))

(defn- get-file-by-id [access-token file-id]
  (when file-id
    (-> (js/fetch
         (str "https://www.googleapis.com/drive/v3/files/" file-id "?alt=media")
         #js {:headers #js {:authorization (str "Bearer " access-token)}})
        (.then throw-on-error)
        (.then #(.blob %))
        (.then #(.text %))
        (.then edn/read-string))))

(defn- get-file-by-name [access-token file-name]
  (-> (file-id access-token file-name)
      (.then (partial get-file-by-id access-token))))

(deftype GDrive [get-access-token file-name]
  IFile
  (-read-file [_]
    (-> (get-access-token)
        (.then (fn [access-token]
                 (get-file-by-name access-token file-name)))))
  (-write-file [_ data]
    (-> (get-access-token)
        (.then (fn [access-token]
                 (file-id access-token file-name)))
        (.then (fn [id]
                 (-> (get-access-token)
                     (.then (fn [access-token]
                              (if id
                                (update-file access-token id data)
                                (create-file access-token file-name data))))))))))
