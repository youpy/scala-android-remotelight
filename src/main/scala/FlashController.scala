package com.buycheapviagraonlinenow.remotelight

import _root_.android.hardware.Camera

class FlashController {
  var camera:Camera = null

  def resume {
    camera = Camera.open
  }

  def pause {
    if(camera != null) {
      camera.release
    }
  }

  def on {
    setFlashMode("torch")
  }

  def off {
    setFlashMode("off")
  }

  def setFlashMode(mode:String) {
    val cameraParameters = camera.getParameters

    if(cameraParameters.getFlashMode != mode) {
      cameraParameters.setFlashMode(mode)
      camera.setParameters(cameraParameters)
    }
  }
}
