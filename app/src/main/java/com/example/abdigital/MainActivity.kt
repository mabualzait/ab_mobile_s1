package com.example.abdigital

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.abdigital.Constants.studentID

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val label: TextView = findViewById(R.id.malik)
        var id = intent.extras?.get(studentID) as Int
        var name = intent.extras?.get("name") as String
        name.let {
            label.text = it
        }
        val malikButton: Button = findViewById(R.id.button)
        val aaaButton: Button = findViewById(R.id.button2)
        malikButton.text = "New Button name "

        label.setOnClickListener {
            Toast.makeText(baseContext, " Hi how are you !", Toast.LENGTH_LONG).show()
        }

        malikButton.setOnClickListener {
        }

    }


}