(defproject net.clojars.shiunko/xt-util "1.0.0"
  :description "xtdb utils for myself"
  :url "https://github.com/shiunko/xtdb-util"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]

                 [com.xtdb/xtdb-core "1.21.0.1"]
                 [com.xtdb/xtdb-rocksdb "1.21.0.1"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
