package com.example.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById<Button>(R.id.button)
        val inputtext1: EditText = findViewById<EditText>(R.id.editTextText)
        val inputtext2: EditText = findViewById<EditText>(R.id.editTextText2)
    }
}