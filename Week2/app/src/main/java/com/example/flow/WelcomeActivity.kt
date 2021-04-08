package com.example.flow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        supportActionBar?.hide()

        val skipButton = findViewById<Button>(R.id.skipButt)
        skipButton.setOnClickListener {
            val intent = Intent(this, onboarding1Activity::class.java)
            startActivity(intent)
        }
    }
}