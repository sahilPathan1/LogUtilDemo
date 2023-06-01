package com.example.mylibrary

import android.content.Context
import android.util.Log
import android.widget.Toast

object LogSortCut {
    var TAG = "SUPER_AWESOME_TAG"

    fun debug(message: String) {
        Log.d(TAG, message)
    }

    fun error(message: String) {
        Log.e(TAG, message)
    }

    fun toast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}