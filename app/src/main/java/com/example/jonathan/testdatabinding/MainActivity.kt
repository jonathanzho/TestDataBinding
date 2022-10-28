package com.example.jonathan.testdatabinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jonathan.testdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG: String = "TDB: MainActivity"

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CalculationViewModel
    private lateinit var factory: CalculationViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        factory = CalculationViewModelFactory(MyCalculation())
        viewModel = ViewModelProvider(this, factory)[CalculationViewModel::class.java]
        binding.myViewModel = viewModel
        binding.lifecycleOwner = this
    }
}
