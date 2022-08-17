(ns net.zthc.xtdb.util
  (:require [xtdb.api :as xt]))

(def ^:dynamic *xtdb-node* nil)

(defn submit-tx [q]
  (->>
    (xt/submit-tx *xtdb-node* q)
    (xt/await-tx *xtdb-node*)))

(defn put! [& ms]
  (->>
    (xt/submit-tx
      *xtdb-node*
      (for [m ms]
        [::xt/put m]))
    (xt/await-tx *xtdb-node*)))

(defn rm! [& ids]
  (->>
    (xt/submit-tx
      *xtdb-node*
      (for [id ids]
        [::xt/delete id]))
    (xt/await-tx *xtdb-node*)))

(defn evict! [& ids]
  (->>
    (xt/submit-tx
      *xtdb-node*
      (for [id ids]
        [::xt/evict id]))
    (xt/await-tx *xtdb-node*)))

(defn query
  [q & args]
  (apply xt/q (xt/db *xtdb-node*) q args))

(defn entity
  [eid]
  (xt/entity (xt/db *xtdb-node*) eid))

(defn now-id []
  (.format
    (.withZone
      (java.time.format.DateTimeFormatter/ofPattern "yyyy-MM-dd-HHmmss")
      (java.time.ZoneId/systemDefault))
    (java.time.Instant/now)))

(defn uuid
  ([] (str (java.util.UUID/randomUUID)))
  ([s]
   (cond
     (string? s) (java.util.UUID/fromString s)
     (uuid? s) s)))