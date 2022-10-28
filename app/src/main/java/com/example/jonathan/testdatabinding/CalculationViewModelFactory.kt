package com.example.jonathan.testdatabinding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * When your ViewModel's primary constructor has parameters, you have to create your
 * version of ViewModelProvider.Factory so that these parameters can be passed to the
 * factory for your ViewModel instance creation.
 */
class CalculationViewModelFactory(private val calculation: Calculation) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(Calculation::class.java).newInstance(calculation)
    }
}