package com.example.jonathan.testdatabinding

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val TAG = "TDB: MainViewModel: "

    var text = " Welcome to my application "

    fun updateText() {
        Log.d(TAG, "updateText")

        text = " Text is Updated "
    }
}