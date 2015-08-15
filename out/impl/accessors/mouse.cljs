(ns phzr.impl.accessors.mouse)

(def ^:private mouse-constants
  {:back-button "BACK_BUTTON"
   :forward-button "FORWARD_BUTTON"
   :left-button "LEFT_BUTTON"
   :middle-button "MIDDLE_BUTTON"
   :no-button "NO_BUTTON"
   :right-button "RIGHT_BUTTON"
   :wheel-down "WHEEL_DOWN"
   :wheel-up "WHEEL_UP"})

(def mouse-get-properties
  {:button "button"
   :callback-context "callbackContext"
   :capture "capture"
   :enabled "enabled"
   :event "event"
   :game "game"
   :locked "locked"
   :mouse-down-callback "mouseDownCallback"
   :mouse-out-callback "mouseOutCallback"
   :mouse-over-callback "mouseOverCallback"
   :mouse-up-callback "mouseUpCallback"
   :mouse-wheel-callback "mouseWheelCallback"
   :pointer-lock "pointerLock"
   :stop-on-game-out "stopOnGameOut"
   :wheel-delta "wheelDelta"})

(def mouse-set-properties
  {:button "button"
   :callback-context "callbackContext"
   :capture "capture"
   :enabled "enabled"
   :event "event"
   :game "game"
   :locked "locked"
   :mouse-down-callback "mouseDownCallback"
   :mouse-out-callback "mouseOutCallback"
   :mouse-over-callback "mouseOverCallback"
   :mouse-up-callback "mouseUpCallback"
   :mouse-wheel-callback "mouseWheelCallback"
   :pointer-lock "pointerLock"
   :stop-on-game-out "stopOnGameOut"
   :wheel-delta "wheelDelta"})