package com.example.jonathan.testdatabinding

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val TAG = "TDB: MainViewModel: "

    private var text = MutableLiveData<String>(" Welcome to Test Data Binding! ");

    // text getter:
    fun text(): LiveData<String> {
        return text
    }

    fun updateText() {
        Log.d(TAG, "updateText")

        text.setValue(" Text is Updated ")
    }
}