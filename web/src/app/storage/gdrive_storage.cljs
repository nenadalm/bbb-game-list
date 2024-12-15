(ns app.storage.gdrive-storage
  (:require
   [app.storage.local-storage :refer [SetLocalStorage LocalStorage]]
   [app.storage.protocols :refer [ISetStorage ISync IClear] :as proto]
   [app.storage.driver.gdrive :as gdrive]
   [app.google :as google]))

(defn- sync [changes-storage snapshot-storage drive]
  (-> (proto/-read-file drive)
      (.then
       (fn do-sync [remote-snapshot]
         (let [remote-snapshot (or remote-snapshot #{})
               remote-snapshot-meta (meta remote-snapshot)
               local-changes (proto/read changes-storage)
               local-snapshot (proto/get-all snapshot-storage)
               local-snapshot-meta (meta local-snapshot)
               new-snapshot (reduce-kv
                             (fn [new-snapshot k v]
                               (if (and
                                    (not= (contains? local-snapshot k) v)
                                    (= (get-in remote-snapshot-meta [:items k])
                                       (get-in local-snapshot-meta [:items k])))
                                 (with-meta
                                   (if v
                                     (conj new-snapshot k)
                                     (disj new-snapshot k))
                                   (update-in (meta new-snapshot) [:items k :version] (fnil inc 0)))
                                 new-snapshot))
                             remote-snapshot
                             local-changes)]
           (if (= new-snapshot local-snapshot)
             (let [newest-local-changes (proto/read changes-storage)]
               (when (= newest-local-changes local-changes)
                 (proto/store changes-storage {})))
             (-> (proto/-write-file drive new-snapshot)
                 (.then
                  (fn update-local-state [_]
                    (let [newest-local-changes (proto/read changes-storage)]
                      (proto/store (.-storage snapshot-storage) new-snapshot)
                      (when (= newest-local-changes local-changes)
                        (proto/store changes-storage {}))))))))))))

(deftype SetGdriveStorage [changes-storage snapshot-storage drive]
  ISetStorage
  (-get-all [_]
    (reduce-kv
     (fn [items k v]
       (if v
         (conj items k)
         (disj items k)))
     (proto/get-all snapshot-storage)
     (proto/read changes-storage)))
  (-add-all [this items]
    (proto/store
     changes-storage
     (reduce
      (fn [items v]
        (assoc items v true))
      (proto/read changes-storage)
      items))
    (proto/get-all this))
  (-add-item [this item]
    (proto/store
     changes-storage
     (-> (proto/read changes-storage)
         (assoc item true)))
    (proto/get-all this))
  (-remove-item [this item]
    (proto/store
     changes-storage
     (-> (proto/read changes-storage)
         (assoc item false)))
    (proto/get-all this))
  IClear
  (-clear [_]
    (js/Promise.all #js [(proto/clear changes-storage)
                         (proto/clear snapshot-storage)]))
  ISync
  (-sync [_]
    (sync changes-storage snapshot-storage drive)))

(defn create-set [storage-key-ns]
  (let [changes-key (str storage-key-ns "/" "changes")
        snapshot-key (str storage-key-ns "/" "snapshot")
        drive (gdrive/GDrive.
               google/get-access-token
               "favorites.edn")]
    (SetGdriveStorage.
     (LocalStorage. changes-key)
     (SetLocalStorage. (LocalStorage. snapshot-key))
     drive)))
