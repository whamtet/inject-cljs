(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'inject.core
   :output-to "out/inject.js"
   :output-dir "out"})
