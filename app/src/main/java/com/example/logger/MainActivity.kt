package com.example.logger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.logger.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.isEnabled = true
        Logger.d("MainActivity", "hello")
    }
}