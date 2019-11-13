(ns gen-phzr.core
  (:require [camel-snake-kebab.core :as csk]
            [cljfmt.core :as cfmt]
            [clojure.java.io :as io]
            [cuerdas.core :as str]
            [gen-phzr.codegen.core :as cg]
            [cheshire.core :as c]
            [clojure.pprint]
            [gen-phzr.util :as u])
  (:gen-class))

(defn -main
  [& args]
  (let [files (cg/gen-files "phaser3.json")]
    (doseq [f files]
      (println "Writing to" (:path f))
      (io/make-parents (:path f))
      (spit (:path f) (:text f)))))


;; (def docs (:docs (c/parse-string (slurp (io/resource "phaser3.json")) true)))
;; (def class-col (filter #(= (:kind %) "class") docs))
;; (def properties-by-class (group-by (juxt :memberof :kind) docs))

;; (def transposed-classes
;;   (into {} (for [klass class-col
;;                  :let [class-name (:longname klass)]]
;;              [(:longname klass) (merge klass {:functions
;;                                               (get properties-by-class [class-name "function"])
;;                                               :members
;;                                               (get properties-by-class [class-name "member"])})])))

