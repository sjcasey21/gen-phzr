(ns phzr.impl.accessors.scale-manager)

(def scale-manager-constants
  {:exact-fit "EXACT_FIT"
   :no-scale "NO_SCALE"
   :resize "RESIZE"
   :show-all "SHOW_ALL"
   :user-scale "USER_SCALE"})

(def scale-manager-get-properties
  {:aspect-ratio "aspectRatio"
   :bounding-parent "boundingParent"
   :bounds "bounds"
   :enter-incorrect-orientation "enterIncorrectOrientation"
   :full-screen-scale-mode "fullScreenScaleMode"
   :full-screen-target "fullScreenTarget"
   :grid "grid"
   :height "height"
   :is-full-screen "isFullScreen"
   :is-game-landscape "isGameLandscape"
   :is-game-portrait "isGamePortrait"
   :is-landscape "isLandscape"
   :is-portrait "isPortrait"
   :leave-incorrect-orientation "leaveIncorrectOrientation"
   :on-full-screen-change "onFullScreenChange"
   :on-full-screen-error "onFullScreenError"
   :on-full-screen-init "onFullScreenInit"
   :on-orientation-change "onOrientationChange"
   :on-size-change "onSizeChange"
   :page-align-horizontally "pageAlignHorizontally"
   :page-align-vertically "pageAlignVertically"
   :parent-is-window "parentIsWindow"
   :parent-node "parentNode"
   :parent-scale-factor "parentScaleFactor"
   :scale-factor "scaleFactor"
   :scale-mode "scaleMode"
   :screen-orientation "screenOrientation"
   :source-aspect-ratio "sourceAspectRatio"
   :width "width"
   :window-constraints "windowConstraints"})

(def scale-manager-set-properties
  {:enter-incorrect-orientation "enterIncorrectOrientation"
   :full-screen-scale-mode "fullScreenScaleMode"
   :full-screen-target "fullScreenTarget"
   :grid "grid"
   :leave-incorrect-orientation "leaveIncorrectOrientation"
   :on-full-screen-change "onFullScreenChange"
   :on-full-screen-error "onFullScreenError"
   :on-full-screen-init "onFullScreenInit"
   :on-orientation-change "onOrientationChange"
   :on-size-change "onSizeChange"
   :page-align-horizontally "pageAlignHorizontally"
   :page-align-vertically "pageAlignVertically"
   :parent-is-window "parentIsWindow"
   :parent-node "parentNode"
   :scale-mode "scaleMode"
   :window-constraints "windowConstraints"})