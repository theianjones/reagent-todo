(ns reagent-todo.prod
  (:require [reagent-todo.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
