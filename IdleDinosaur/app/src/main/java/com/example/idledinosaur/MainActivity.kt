package com.example.idledinosaur

import android.content.Intent
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

        findViewById<Button>(R.id.menu_button).setOnClickListener {
            Log.d("Menu", "Menu Clicked")
            menuClicked();
        }

        findViewById<Button>(R.id.credits_button).setOnClickListener {
            Log.d("Credits", "Credits Clicked")
            creditsClicked();
        }
    }

    private fun creditsClicked() {
        val intent = Intent(this, CreditsActivity::class.java)
        startActivity(intent)
    }

    private fun menuClicked() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}