package com.example.jonathan.testdatabinding

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculationViewModel(private val calculations: Calculations) : ViewModel() {
    private val TAG = "TDB: CalculationViewModel"

    var a = MutableLiveData<String>()
    var b = MutableLiveData<String>()

    var additionResult = MutableLiveData<String>()

    fun calculateAddition() {
        Log.d(TAG, "calculateAddition")

        val aValue = a.value?.toInt()
        val bValue = a.value?.toInt()

        if (aValue != null && bValue != null) {
            val addition = calculations.calculateAddition(aValue, bValue)
            additionResult.value = addition.toString()
        } else {
            Log.w(TAG, "calculateAddition: Please enter values for a and/or b")
        }
    }
}