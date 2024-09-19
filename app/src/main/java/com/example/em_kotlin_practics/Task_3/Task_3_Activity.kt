package com.example.em_kotlin_practics.Task_3

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.em_kotlin_practics.R
import com.example.em_kotlin_practics.databinding.ActivityTask2Binding
import com.example.em_kotlin_practics.databinding.ActivityTask3Binding
import java.math.BigDecimal

class Task_3_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTask3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfObjects = listOf(
            Memory(),
            Monitor(),
            93,
            AppCompatActivity(),
            Processor(),
            String,
            false,
            45.34,
            BigDecimal.ONE
        )

        binding.getResultBTM.setOnClickListener {
            val foundResult = listOfObjects.findInt()
            Log.d("MyLog", "foundResult:${foundResult}")
        }
    }
}

class Memory
class Monitor
class Processor

fun List<Any>.findInt():Int? {
    for (i in this) {
        if (i is Int) return i
    }
    return null
}