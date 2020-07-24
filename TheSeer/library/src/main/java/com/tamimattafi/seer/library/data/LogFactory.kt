package com.tamimattafi.seer.library.data

import android.graphics.Color
import com.tamimattafi.seer.library.data.Log.Resources.*

object LogFactory {

    fun createErrorLog(tag: String, message: String): Log = Log(
        tag = tag,
        message = message,
        color = Color.RED,
        usage = setOf(
            CPU,
            RAM,
            STORAGE,
            NETWORK,
            BATTERY
        ),
        showStackTrace = true,
        showCaller = true
    )

    fun createWarningLog(tag: String, message: String): Log = Log(
        tag = tag,
        message = message,
        color = Color.YELLOW,
        usage = setOf(
            CPU,
            RAM,
            NETWORK
        ),
        showStackTrace = false,
        showCaller = true
    )


    fun createInfoLog(tag: String, message: String): Log = Log(
        tag = tag,
        message = message,
        color = Color.WHITE,
        usage = null,
        showStackTrace = false,
        showCaller = false
    )

}