(ns inject.core
  (:require cljs.js))

(def st (cljs.js/empty-state))

(enable-console-print!)

(set! js/c
      (fn [src]
        (binding [cljs.js/*eval-fn* #(-> % :source js/eval)]
          (cljs.js/eval-str st src prn))))

(println "done")
