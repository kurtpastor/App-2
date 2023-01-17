package com.example.workplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class window4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window4)

        val message = intent.getStringExtra("EXTRA_MESSAGE2")

        val textView = findViewById<TextView>(R.id.changeText2).apply {
            text = message
        }
    }
}