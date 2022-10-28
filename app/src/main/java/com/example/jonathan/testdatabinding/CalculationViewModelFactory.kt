package com.example.jonathan.testdatabinding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * It's recommended to use ViewModelProvider.Factory design pattern.
 */
class CalculationViewModelFactory(
    private val calculation: Calculation
) : ViewModelProvider.Factory {

    override fun<T : ViewModel> create(modelClass: Class<T>): T {
        return CalculationViewModel(calculation) as T
    }
}