package com.example.myfirsta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            findViewById<Button>(R.id.button).text="PRZYCISK"
        }

        findViewById<Button>(R.id.buttonnn).setOnClickListener{
            findViewById<Button>(R.id.buttonnn).text="ZAPRASZAMY"
            findViewById<Button>(R.id.buttonnn).
        }
    }
}