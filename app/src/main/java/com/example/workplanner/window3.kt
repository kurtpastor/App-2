package com.example.workplanner


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class window3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window3)


        val message = intent.getStringExtra("EXTRA_MESSAGE")

        val textView = findViewById<TextView>(R.id.idTVDate2).apply {
            text = message
        }

        val savebtn = findViewById<Button>(R.id.saveButton)

        savebtn.setOnClickListener {
            callActivity()
        }


    }
    private fun callActivity() {
        val chngtxt = findViewById<EditText>(R.id.changeText2)
        val message = chngtxt.text.toString()

        val intent = Intent(this, window4::class.java).also {
            it.putExtra("EXTRA_MESSAGE2", message)
            startActivity(it)
        }

    }

}