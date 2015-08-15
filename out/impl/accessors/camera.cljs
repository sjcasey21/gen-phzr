(ns phzr.impl.accessors.camera)

(def ^:private camera-constants
  {:follow-lockon "FOLLOW_LOCKON"
   :follow-platformer "FOLLOW_PLATFORMER"
   :follow-topdown "FOLLOW_TOPDOWN"
   :follow-topdown-tight "FOLLOW_TOPDOWN_TIGHT"})

(def camera-get-properties
  {:at-limit "atLimit"
   :bounds "bounds"
   :deadzone "deadzone"
   :display-object "displayObject"
   :game "game"
   :height "height"
   :id "id"
   :position "position"
   :round-px "roundPx"
   :scale "scale"
   :target "target"
   :total-in-view "totalInView"
   :view "view"
   :visible "visible"
   :width "width"
   :world "world"
   :x "x"
   :y "y"})

(def camera-set-properties
  {:at-limit "atLimit"
   :bounds "bounds"
   :deadzone "deadzone"
   :display-object "displayObject"
   :game "game"
   :height "height"
   :id "id"
   :position "position"
   :round-px "roundPx"
   :scale "scale"
   :target "target"
   :view "view"
   :visible "visible"
   :width "width"
   :world "world"
   :x "x"
   :y "y"})