(ns app.storage.local-storage
  (:require
   [clojure.edn :as edn]
   [app.storage.protocols :refer [ISetStorage IEdnStorage] :as proto]))

(deftype LocalStorage [storage-key]
  IEdnStorage
  (-read [_] (edn/read-string (js/localStorage.getItem storage-key)))
  (-store [_ x] (binding [*print-meta* true] (js/localStorage.setItem storage-key (pr-str x)))))

(defn- load [storage]
  (or
   (proto/read storage)
   #{}))

(defn- store [m storage]
  (proto/store storage m)
  m)

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
  (-add-item [_ item] (add-item storage item))
  (-remove-item [_ item] (remove-item storage item)))

(defn create-set [storage-key]
  (SetLocalStorage.
   (LocalStorage. storage-key)))
