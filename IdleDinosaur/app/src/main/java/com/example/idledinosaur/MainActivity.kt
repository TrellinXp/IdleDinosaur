package com.example.idledinosaur

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login);
        findViewById<Button>(R.id.google_button).setOnClickListener {
            Log.d("Login", "Login Clicked")
        }

        findViewById<Button>(R.id.credits_button).setOnClickListener {
            Log.d("Credits", "Credits Clicked")
        }
    }
}