package com.example.idledinosaur

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        findViewById<Button>(R.id.back_button2).setOnClickListener {
            Log.d("Back", "Back Clicked")
            backClicked();
        }
    }
    private fun backClicked() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}
