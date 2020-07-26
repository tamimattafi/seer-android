package com.tamimattafi.seer.library.data

import android.util.Log

data class SLog(
    val tag: String,
    val message: String,
    val type: Type,
    val usage: Set<Resources>?,
    val showStackTrace: Boolean
) {

    enum class Resources {
        CPU, RAM, STORAGE, NETWORK, BATTERY
    }

    enum class Type(val rawValue: Int)  {
        ERROR(Log.ERROR),
        WARNING(Log.WARN),
        INFO(Log.INFO)
    }

}

