package com.example.jonathan.testdatabinding

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Use ViewModel to persist data after a configuration change.
 */
// Primary constructor is like (...).
// Inheritance is represented by <ChildClass> : <ParentClass>().
class CalculationViewModel(private val calculation: Calculation) : ViewModel() {
    private val TAG: String = "TDB: CalculationViewModel"

    // Use LiveData for live updates:
    var a = MutableLiveData<String>()
    var b = MutableLiveData<String>()
    var additionResult = MutableLiveData<String>()

    fun calculateAddition() {
        Log.d(TAG, "calculateAddition")

        val aValue = a.value?.toInt()
        val bValue = b.value?.toInt()

        if (aValue != null && bValue != null) {
            val addition = calculation.calculateAddition(aValue, bValue)
            additionResult.value = addition.toString()
        } else {
            Log.w(TAG, "calculateAddition: Please enter values for a and/or b")
        }
    }
}
