package com.example.generationdefinition

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import androidx.annotation.IntegerRes


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var personalGeneration = findViewById<View>(R.id.personalGeneration) as TextView

        var enter=findViewById<View>(R.id.enter) as Button


            personalGeneration.addTextChangedListener(object : TextWatcher {

                override fun afterTextChanged(s: Editable) {}

                override fun beforeTextChanged(s: CharSequence, start: Int,
                                               count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence, start: Int,
                                           before: Int, count: Int) {

                }
            })
        }




   public fun generationDefinition(view: android.view.View) {
        var personalGeneration1 = findViewById<View>(R.id.personalGeneration) as TextView
        var conclusion= findViewById<View>(R.id.conclusion) as TextView
       var check: Int?
       check=personalGeneration1.getText().toString().toIntOrNull()

        if (check != null) {
            var personalGeneration: Int = Integer.parseInt(personalGeneration1.getText().toString());
            if (personalGeneration >= 1946 && personalGeneration <= 2012) {
                if (personalGeneration <= 1964) {
                     conclusion.text=("Your generation is Baby boomers.")
                } else if (personalGeneration <= 1980) {
                     conclusion.text= "Your generation is Generation X."
                } else if (personalGeneration <= 1996) {
                    conclusion.text= "Your generation is Generation Y."
                }else if (personalGeneration <= 2012) {
                    conclusion.text="Your generation is Generation Z."
                }

                conclusion.visibility = View.VISIBLE
            }else{
                conclusion.text="Try again. You didn't enter a year from 1946 to 2012."
                conclusion.visibility = View.VISIBLE
            }
        } else {
            conclusion.text="Try again. You didn't enter a number."
            conclusion.visibility = View.VISIBLE
        }
    }


}








