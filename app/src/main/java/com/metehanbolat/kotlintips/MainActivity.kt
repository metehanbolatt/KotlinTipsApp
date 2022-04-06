package com.metehanbolat.kotlintips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@ExperimentalTime
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val (value: String, time: Duration) = measureTimedValue { someOperation() }
        println("This operation took $time to calculate $value")
    }

    private fun someOperation(): String {
        repeat(30_000) {
            println('.')
        }
        return "finished."
    }

}