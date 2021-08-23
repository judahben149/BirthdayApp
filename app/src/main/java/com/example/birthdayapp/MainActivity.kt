package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val image : ImageView = findViewById(R.id.imageView2)
        val submitButton : Button = findViewById(R.id.submit)

        submitButton.setOnClickListener {
            setContentView(R.layout.activity2_main)
        }
    }
}