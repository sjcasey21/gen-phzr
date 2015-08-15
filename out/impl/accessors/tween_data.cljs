(ns phzr.impl.accessors.tween-data)

(def ^:private tween-data-constants
  {:complete "COMPLETE"
   :looped "LOOPED"
   :pending "PENDING"
   :running "RUNNING"})

(def tween-data-get-properties
  {:delay "delay"
   :dt "dt"
   :duration "duration"
   :easing-function "easingFunction"
   :game "game"
   :in-reverse "inReverse"
   :interpolate "interpolate"
   :interpolation-context "interpolationContext"
   :interpolation-function "interpolationFunction"
   :is-from "isFrom"
   :is-running "isRunning"
   :parent "parent"
   :percent "percent"
   :repeat-counter "repeatCounter"
   :repeat-delay "repeatDelay"
   :start-time "startTime"
   :value "value"
   :yoyo "yoyo"
   :yoyo-delay "yoyoDelay"})

(def tween-data-set-properties
  {:delay "delay"
   :dt "dt"
   :duration "duration"
   :easing-function "easingFunction"
   :game "game"
   :in-reverse "inReverse"
   :interpolate "interpolate"
   :interpolation-context "interpolationContext"
   :interpolation-function "interpolationFunction"
   :is-from "isFrom"
   :is-running "isRunning"
   :parent "parent"
   :repeat-counter "repeatCounter"
   :repeat-delay "repeatDelay"
   :start-time "startTime"
   :yoyo "yoyo"
   :yoyo-delay "yoyoDelay"})