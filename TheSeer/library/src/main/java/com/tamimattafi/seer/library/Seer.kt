package com.tamimattafi.seer.library

import com.tamimattafi.seer.library.data.SLog
import com.tamimattafi.seer.library.data.SLogFactory


object Seer {

    fun error(tag: String, message: String) {
        SLogFactory.createErrorLog(tag, message).print()
    }

    fun warning(tag: String, message: String) {
        SLogFactory.createWarningLog(tag, message).print()
    }

    fun info(tag: String, message: String) {
        SLogFactory.createInfoLog(tag, message).print()
    }

    fun custom(log: SLog) {
        log.print()
    }

    private fun SLog.print() {

    }

}