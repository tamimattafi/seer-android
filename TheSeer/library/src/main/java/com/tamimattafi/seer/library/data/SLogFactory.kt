package com.tamimattafi.seer.library.data

import com.tamimattafi.seer.library.data.SLog.Resources.*

object SLogFactory {

    fun createErrorLog(tag: String, message: String) = SLog(
        tag = tag,
        message = message,
        type = SLog.Type.ERROR,
        usage = setOf(
            CPU,
            RAM,
            STORAGE,
            NETWORK,
            BATTERY
        ),
        showStackTrace = true
    )

    fun createWarningLog(tag: String, message: String) = SLog(
        tag = tag,
        message = message,
        type = SLog.Type.WARNING,
        usage = setOf(
            CPU,
            RAM,
            NETWORK
        ),
        showStackTrace = false
    )

    fun createInfoLog(tag: String, message: String) = SLog(
        tag = tag,
        message = message,
        type = SLog.Type.INFO,
        usage = null,
        showStackTrace = false
    )

}