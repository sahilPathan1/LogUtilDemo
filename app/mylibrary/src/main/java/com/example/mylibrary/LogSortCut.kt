package com.example.mylibrary

import android.app.Notification.MessagingStyle.Message
import android.nfc.Tag
import android.util.Log

object LogSortCut {
    var TAG = "SUPER_AWESOME_TAG"

    fun debug(message: String) {
        Log.d(TAG, message)
    }

    fun error(message: String) {
        Log.e(TAG, message)
    }
}