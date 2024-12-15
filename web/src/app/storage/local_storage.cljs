(ns app.storage.local-storage
  (:require
   [clojure.edn :as edn]
   [app.storage.protocols :refer [ISetStorage IEdnStorage ISync IClear] :as proto]))

(deftype LocalStorage [storage-key]
  IEdnStorage
  (-read [_] (edn/read-string (js/localStorage.getItem storage-key)))
  (-store [_ x] (binding [*print-meta* true] (js/localStorage.setItem storage-key (pr-str x))))
  IClear
  (-clear [_]
    (js/localStorage.removeItem storage-key)
    (js/Promise.resolve)))

(defn- load [storage]
  (or
   (proto/read storage)
   #{}))

(defn- store [m storage]
  (proto/store storage m)
  m)

(defn- add-all [storage items]
  (-> (load storage)
      (into items)
      (store storage)))

(defn- add-item [storage item]
  (-> (load storage)
      (conj item)
      (store storage)))

(defn- remove-item [storage item]
  (-> (load storage)
      (disj item)
      (store storage)))

(deftype SetLocalStorage [storage]
  ISetStorage
  (-get-all [_] (load storage))
  (-add-all [_ items] (add-all storage items))
  (-add-item [_ item] (add-item storage item))
  (-remove-item [_ item] (remove-item storage item))
  IClear
  (-clear [_] (proto/clear storage))
  ISync
  (-sync [_] (js/Promise.resolve)))

(defn create-set [storage-key]
  (SetLocalStorage.
   (LocalStorage. storage-key)))
