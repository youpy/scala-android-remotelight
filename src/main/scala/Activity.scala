package com.buycheapviagraonlinenow.remotelight

import _root_.android.app.Activity
import _root_.android.webkit.WebView

class MainActivity extends Activity {
  var flash = new FlashController

  override def onResume {
    super.onResume

    var wv = new WebView(this)

    flash.resume

    wv.getSettings.setJavaScriptEnabled(true)
    wv.addJavascriptInterface(flash, "roid")
    wv.loadUrl("http://youpy.no.de/light/")
  }

  override def onPause {
    super.onPause

    flash.pause
  }
}
