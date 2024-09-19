package com.example.em_kotlin_practics

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.em_kotlin_practics.Task_2.Task_2_Activity
import com.example.em_kotlin_practics.Task_3.Task_3_Activity
import com.example.em_kotlin_practics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnTask2.setOnClickListener {
                startActivity(Intent(this@MainActivity, Task_2_Activity::class.java))
            }
            btnTask3.setOnClickListener {
                startActivity(Intent(this@MainActivity, Task_3_Activity::class.java))
            }
        }

    }
}