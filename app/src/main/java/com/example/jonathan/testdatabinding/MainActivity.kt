package com.example.jonathan.testdatabinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.jonathan.testdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "TDB: MainActivity: "

    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel = MainViewModel()
        binding.mainViewModel = mainViewModel

        binding.lifecycleOwner = this
    }
}
