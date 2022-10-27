package com.example.mobilne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var owoceImages = arrayOf(findViewById<ImageView>(R.id.arbuzImage), findViewById<ImageView>(R.id.bananImage),findViewById<ImageView>(R.id.czeresniaImage), findViewById<ImageView>(R.id.jablkoImage), findViewById<ImageView>(R.id.malinaImage),findViewById<ImageView>(R.id.kokosImage),findViewById<ImageView>(R.id.melonImage),findViewById<ImageView>(R.id.pomaranczaImage),findViewById<ImageView>(R.id.truskawkaImage), findViewById<ImageView>(R.id.jagodaImage))
        var owoceCheckboxes = arrayOf(findViewById<CheckBox>(R.id.arbuz), findViewById<CheckBox>(R.id.banan),findViewById<CheckBox>(R.id.czeresnia), findViewById<CheckBox>(R.id.jablko), findViewById<CheckBox>(R.id.malina),findViewById<CheckBox>(R.id.kokos),findViewById<CheckBox>(R.id.melon),findViewById<CheckBox>(R.id.pomarancza),findViewById<CheckBox>(R.id.truskawka), findViewById<CheckBox>(R.id.jagoda))

        owoceImages.zip(owoceCheckboxes).forEach {pair ->
            var owoc = pair.component1();
            var checkbox =  pair.component2()

            owoc.setVisibility(View.INVISIBLE)

            checkbox.setOnClickListener()
            {
                if(checkbox.isChecked)
                {
                    owoc.setVisibility(View.VIS9IBLE)
                }
                else
                {
                    owoc.setVisibility(View.INVISIBLE)
                }
            };
        }

    }
}