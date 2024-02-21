package com.example.lektion_2_android_studio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find Components
        val btnClickMe: Button = findViewById(R.id.btn_clickMe)

        btnClickMe.setOnClickListener {
            println("CLICKED! ")
        }

    }

}

