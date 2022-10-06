# StatusBarSystemIconsColors

Project just to show how to set Status bar & system icons colors
when changing Dark theme to Light theme and back.

1 - statusBarColor used to change status bar color

    doc annotation:
      Sets the color of the status bar to color. For this to take effect, 
        the window must be drawing the system bar backgrounds with WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS 
        and WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS must not be set. If color is not opaque, 
        consider setting View.SYSTEM_UI_FLAG_LAYOUT_STABLE and View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN.
      The transitionName for the view background will be "android:status:background".

2 - isAppearanceLightStatusBars used to change system icons color to light or dark theme
    
    doc annotation:
      If true, changes the foreground color of the status bars to light
        so that the items on the bar can be read clearly.
      If false, reverts to the default appearance.
      This method has no effect on API < 23.
