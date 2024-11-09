package com.example.myapplication12345

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun qwe(view: View) {
 val imageView : ImageView = findViewById(R.id.imageView3)
 imageView.visibility = View.VISIBLE
    }
    var imagee : Boolean = true
    fun YY(view: View) {
        val imageButton : ImageButton = findViewById(R.id.imageButton)


        if (imagee){
imageButton.setImageResource(R.drawable.fish)
            imagee=false
        }

        else {
            imageButton.setImageResource(R.drawable.img)
            imagee = true
        }



    }
}