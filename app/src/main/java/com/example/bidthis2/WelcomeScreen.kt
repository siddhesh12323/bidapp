package com.example.bidthis2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        val actionBarwelcomescreen = supportActionBar
        actionBarwelcomescreen!!.title = "Bid This"

    }

}