(ns app.storage.protocols)

(defprotocol ISetStorage
  (-get-all [this])
  (-add-item [this item])
  (-remove-item [this item]))

(defprotocol IEdnStorage
  (-read [this])
  (-store [this x]))

(defn get-all [set-storage]
  (-get-all set-storage))

(defn add-item [this item]
  (-add-item this item))

(defn remove-item [this item]
  (-remove-item this item))

(defn read [this]
  (-read this))

(defn store [this x]
  (-store this x))
