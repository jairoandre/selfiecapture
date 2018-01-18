package com.japo.selfiecapture

import android.graphics.BitmapFactory
import android.media.Image

/**
 * Created by jairo on 1/18/18.
 */
internal class SelfiSender(
        private val image: Image

) : Runnable {
    override fun run() {
        image.planes.first().buffer
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}