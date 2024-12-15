(ns app.storage.protocols)

(defprotocol IFile
  (-read-file [this] "Read file. Returns Promise<any> on completion.")
  (-write-file [this data] "Writes file. Returns Promise<void> on completion."))

(defprotocol ISetStorage
  (-get-all [this])
  (-add-all [this items])
  (-add-item [this item])
  (-remove-item [this item]))

(defprotocol IEdnStorage
  (-read [this])
  (-store [this x]))

(defprotocol ISync
  (-sync [this] "Sync changes with remote storage. Returns Promise<void> on completion."))

(defprotocol IClear
  (-clear [this] "Clears the storage. Returns Promise<void> on completion."))

(defn get-all [set-storage]
  (-get-all set-storage))

(defn add-all [set-storage items]
  (-add-all set-storage items))

(defn add-item [this item]
  (-add-item this item))

(defn remove-item [this item]
  (-remove-item this item))

(defn read [this]
  (-read this))

(defn store [this x]
  (-store this x))

(defn sync [this]
  (-sync this))

(defn clear [this]
  (-clear this))
