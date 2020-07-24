package com.tamimattafi.seer.library

import com.tamimattafi.seer.library.data.Log
import com.tamimattafi.seer.library.data.LogFactory


object Seer {

    fun error(tag: String, message: String) {
        LogFactory.createErrorLog(tag, message).print()
    }

    fun warning(tag: String, message: String) {
        LogFactory.createWarningLog(tag, message).print()
    }

    fun info(tag: String, message: String) {
        LogFactory.createInfoLog(tag, message).print()
    }

    fun custom(log: Log) {
        log.print()
    }

    private fun Log.print() {

    }

}