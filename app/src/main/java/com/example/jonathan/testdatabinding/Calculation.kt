package com.example.jonathan.testdatabinding

/**
 * It's recommended to have an interface for a set of functions.
 */
interface Calculation {
    fun calculateAddition(a: Int, b: Int): Int
    fun calculateSubtraction(a: Int, b: Int): Int
}