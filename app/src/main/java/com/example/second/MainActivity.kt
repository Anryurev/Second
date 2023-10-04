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
        val inputtext3: EditText = findViewById<EditText>(R.id.editTextText2)
        button.setOnClickListener {
            val n = inputtext1.text.toString().toInt()
            val a = inputtext2.text.toString().toDouble()
            var result = 0.0
            for (i in 0..n){
                result += result / (a + i)
            }
            inputtext3.setText(result.toString())
        }

    }
}