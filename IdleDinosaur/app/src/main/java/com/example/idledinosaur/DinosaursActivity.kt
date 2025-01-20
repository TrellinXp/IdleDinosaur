package com.example.idledinosaur

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment

class DinosaursActivity : AppCompatActivity() {

    var imageViews = intArrayOf(R.id.dinosaur1, R.id.dinosaur2, R.id.dinosaur3, R.id.dinosaur4, R.id.dinosaur5
    ,  R.id.dinosaur6,  R.id.dinosaur7,  R.id.dinosaur8,  R.id.dinosaur9);

    var isImageViewVisible = booleanArrayOf(false, false, false, false, false, false, false);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinosaurs)
        findViewById<Button>(R.id.back_button4).setOnClickListener {
            Log.d("Back", "Back Clicked")
            backClicked();
        }

        var count = 0;
        for (item: Int in imageViews) {
            val imageView = findViewById<ImageView>(imageViews[count]);
            //imageView.isVisible = isImageViewVisible[count];
            imageView.setOnClickListener {
                Log.d("Dialog", "Open Dialog")
                openDialog(imageView.getDrawable());
            }
            count++;
        }
    }

    private fun openDialog(drawable: Drawable?) {
        StartGameDialogFragment().show(supportFragmentManager, "GAME_DIALOG")
    }

    private fun backClicked() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }

}

class StartGameDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction.
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Upgrade Dinosaur")

                .setPositiveButton("Close") { dialog, id ->
                    // START THE GAME!
                }
                .setNegativeButton("Cancel") { dialog, id ->
                    // User cancelled the dialog.
                }
            // Create the AlertDialog object and return it.
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}