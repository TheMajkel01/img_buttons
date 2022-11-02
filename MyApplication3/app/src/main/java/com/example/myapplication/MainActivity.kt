package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.logo_zschie)

        findViewById<Button>(R.id.drzewo).setOnClickListener {
            findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.tree)


        findViewById<Button>(R.id.zlator).setOnClickListener{
            findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.zlator)
        }
        }
    }
}