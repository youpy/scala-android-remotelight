package com.buycheapviagraonlinenow.remotelight

import _root_.android.hardware.Camera

class FlashController {
  var camera:Camera = null

  def on {
    camera = Camera.open
    val cameraParameters = camera.getParameters

    if(cameraParameters.getFlashMode != "touch") {
      cameraParameters.setFlashMode("torch")
      camera.setParameters(cameraParameters)
    }
  }

  def off {
    if(camera != null) {
      camera.release
    }
  }
}
