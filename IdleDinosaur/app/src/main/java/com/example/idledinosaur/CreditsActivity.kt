package com.example.idledinosaur

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreditsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credits);

        findViewById<Button>(R.id.back_button).setOnClickListener {
            Log.d("Back", "Back Clicked")
            backClicked();
        }

        var t2 = findViewById<TextView>(R.id.textView7);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private fun backClicked() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}