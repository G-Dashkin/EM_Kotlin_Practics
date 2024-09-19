package com.example.em_kotlin_practics.Task_2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.em_kotlin_practics.databinding.ActivityTask2Binding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class Task_2_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTask2Binding
    private val startupTime by StartupTimeDelegate(CoroutineScope(Dispatchers.IO))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        startupTime
    }
}


class StartupTimeDelegate(private val scope: CoroutineScope) : ReadOnlyProperty<Any, Long> {
    private val currentTime = System.currentTimeMillis()
    override fun getValue(thisRef: Any, property: KProperty<*>): Long {
        scope.launch(Dispatchers.IO) {
            while (true) {
                Log.d("MyLog","Application startup time: ${convertTimestampToDateTime(currentTime)}")
                delay(3000)
            }
        }
        return currentTime
    }
}

fun convertTimestampToDateTime(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat("yyyy.MM.dd HH:mm:ss")
    return format.format(date)
}