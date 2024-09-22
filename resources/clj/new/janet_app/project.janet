(declare-project
  :name "sandbox"
  :dependencies [{:url "https://github.com/ianthehenry/judge.git" :tag "v2.6.1"}
                 {:url "https://github.com/janet-lang/spork.git"}])

(declare-executable
  :name "{{namespace}}"
  :entry "src/{{nested-dirs}}/main.janet")
