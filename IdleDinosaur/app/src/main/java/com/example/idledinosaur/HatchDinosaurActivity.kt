package com.example.idledinosaur

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.ComponentActivity


private const val s = "Finished"

class HatchDinosaurActivity : ComponentActivity() {

    var timer:  Int = 50
    var timerRunning = booleanArrayOf(false, false, false);
    var bar1Progress = intArrayOf(0, 0, 0);
    var progressBars = intArrayOf(R.id.progressBar1, R.id.progressBar2, R.id.progressBar3);
    var counters = intArrayOf(R.id.counter1, R.id.counter2, R.id.counter3);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breeding)

        findViewById<Button>(R.id.back_button3).setOnClickListener {
            Log.d("Back", "Back Clicked")
            backClicked();
        }

        findViewById<ImageView>(R.id.imageView2).setOnClickListener {
            startTimer(0);
        }

        findViewById<ImageView>(R.id.imageView3).setOnClickListener {
            startTimer(1);
        }

        findViewById<ImageView>(R.id.imageView4).setOnClickListener {
            startTimer(2);
        }
    }

    private fun startTimer(count : Int) {
        if(!timerRunning[count]) {
            timerRunning[count] = true;
            bar1Progress[count] = 0;
            Log.d("Back", "HatchEgg1 Clicked");
            hatchEgg(count);
        }
    }

    private fun hatchEgg(count: Int) {

        object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var counter1 = findViewById<TextView>(counters[count]);
                counter1.setText("Remaining Seconds: " + millisUntilFinished / 1000)
                // logic to set the EditText could go here
                var progressBar1 = findViewById<ProgressBar>(progressBars[count]);
                bar1Progress[count]++;
                progressBar1.setProgress(bar1Progress[count]);
            }

            override fun onFinish() {
                var counter1 = findViewById<TextView>(R.id.counter1);
                counter1.setText("Finished       ")
                timerRunning[count] = false;
            }
        }.start()
    }

    private fun backClicked() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }

}