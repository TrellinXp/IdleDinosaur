package com.example.idledinosaur

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.GridView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DinosaursActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinosaurs)
        //findViewById<GridView>(R.id.gridView)
    }
}