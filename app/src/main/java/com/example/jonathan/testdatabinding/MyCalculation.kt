package com.example.jonathan.testdatabinding

import android.util.Log

/**
 * This is one implementation of the interface Calculation.
 */
class MyCalculation : Calculation {
    private val TAG: String = "TDB: MyCalculation"

    override fun calculateAddition(a: Int, b: Int): Int {
        Log.d(TAG, "calculateAddition: a=[$a], b=[$b]")

        return (a + b)
    }

    override fun calculateSubtraction(a: Int, b: Int): Int {
        Log.d(TAG, "calculateSubtraction: a=[$a], b=[$b]")

        return (a - b)
    }
}
