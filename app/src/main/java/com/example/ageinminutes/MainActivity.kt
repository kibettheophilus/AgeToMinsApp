package com.example.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDatePicker.setOnClickListener {
            //Toast.makeText(context:this)
        //encountered an error
        }

    }

    fun clikDatePicker(view: View){
        //DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->  })
        //error 2
    }
}