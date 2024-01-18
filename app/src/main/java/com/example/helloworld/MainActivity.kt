package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

// Functionality lies in this file

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // xml
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this,"Hello to you too",Toast.LENGTH_SHORT).show()
        }
    }
}