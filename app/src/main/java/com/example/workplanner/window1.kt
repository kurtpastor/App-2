package com.example.workplanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class window1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window1)

        val mainbtn = findViewById<Button>(R.id.mainbutton)

        mainbtn.setOnClickListener {
            val intent = Intent(this,window2::class.java)
            startActivity(intent)
        }
    }
}