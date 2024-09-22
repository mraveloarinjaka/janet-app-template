(ns clj.new.janet-app-template
  (:require [clj.new.templates :refer [renderer project-data ->files] :as tpl]))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn janet-app-template
  "FIXME: write documentation"
  [name]
  (let [render (renderer "janet-app")
        data (project-data name)]
    (println "Generating fresh 'clj new' janet-app project.")
    (->files data
             ["bb.edn" (render "bb.edn" data)]
             ["project.janet" (render "project.janet" data)]
             ["src/{{nested-dirs}}/main.janet" (render "main.janet" data)])))

#_(janet-app-template "space.mrave.sandbox/janet-experiments")

(comment


  (project-data "space.mrave.sandbox/janet-experiments")
; {:date "2024-09-22",
;  :group "net.clojars.space.mrave.sandbox",
;  :name "janet-experiments",
;  :sanitized "janet_experiments",
;  :year 2024,
;  :scm-domain "github.com",
;  :template-nested-dirs "{{nested-dirs}}",
;  :artifact "janet-experiments",
;  :developer "Mraveloarinjaka",
;  :nested-dirs "space/mrave/sandbox/janet_experiments",
;  :version "0.1.0-SNAPSHOT",
;  :namespace "space.mrave.sandbox.janet-experiments",
;  :user "mraveloarinjaka",
;  :scm-user "space.mrave.sandbox",
;  :raw-name "space.mrave.sandbox/janet-experiments"}

  (binding [clj.new.templates/*environment* {:group "net.clojars.mraveloarinjaka"}]
    (project-data "testing"))

  (comment))
