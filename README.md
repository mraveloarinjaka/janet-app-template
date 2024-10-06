# janet-app-template

[clojure](https://clojure.org/) [clj-new](https://github.com/seancorfield/clj-new) template to create a new [janet](https://janet-lang.org/) project using [jpm](https://github.com/janet-lang/jpm) to manage the build process and [babashka](https://babashka.org/) to orchestrate the build tasks.

[![Clojars Project](https://img.shields.io/clojars/v/io.github.mraveloarinjaka/clj-template.janet-app-template.svg)](https://clojars.org/io.github.mraveloarinjaka/clj-template.janet-app-template)

## Usage

Creating a project from this template (the `:clj-new` alias in this template project defaults `:template` to janet-app-template):

```bash
    clojure -X:clj-new :name myname/myproject
    cd myproject
```

Build a deployable jar of this template:

    $ clojure -T:build ci

This will produce an updated `pom.xml` file with synchronized dependencies inside the `META-INF`
directory inside `target/classes` and the JAR in `target`. You can update the version (and SCM tag)
information in generated `pom.xml` by updating `build.clj`.

Install it locally (requires the `ci` task be run first):

    $ clojure -T:build install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment
variables (requires the `ci` task be run first):

    $ clojure -T:build deploy

Your template will be deployed to net.clojars.mraveloarinjaka/janet-app-template on clojars.org by default.

## License

Copyright © 2024 Mandimby RAVELOARINJAKA

Distributed under the Eclipse Public License version 1.0.
