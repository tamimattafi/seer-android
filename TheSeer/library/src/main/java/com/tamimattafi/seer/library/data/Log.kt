package com.tamimattafi.seer.library.data

data class Log(
    val tag: String,
    val message: String,
    val color: Int,
    val usage: Set<Resources>?,
    val showStackTrace: Boolean,
    val showCaller: Boolean
) {

    enum class Resources {
        CPU, RAM, STORAGE, NETWORK, BATTERY
    }

}

