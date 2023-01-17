package com.example.workplanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView

class window2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window2)

        val dateTv = findViewById<TextView>(R.id.idTVDate)
        val CalendarView = findViewById<CalendarView>(R.id.calendarView)



        CalendarView.setOnDateChangeListener(OnDateChangeListener
        { view, year, month, dayOfMonth ->
                val Date = (dayOfMonth.toString() + "-"
                        + (month + 1) + "-" + year)

                dateTv.setText(Date)

        })

        val dayplnr = findViewById<Button>(R.id.dayplanner)

        dayplnr.setOnClickListener {
            val intent = Intent(this,window3::class.java)
            startActivity(intent)

            callActivity()
        }

    }

    private fun callActivity() {
        val Tvdate = findViewById<TextView>(R.id.idTVDate)
        val message = Tvdate.text.toString()

        val intent = Intent(this, window3::class.java).also {
            it.putExtra("EXTRA_MESSAGE", message)
            startActivity(it)
        }
    }
}