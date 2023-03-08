package com.example.plantix_usingml_detection_of_plant_diseases.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.plantix_usingml_detection_of_plant_diseases.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this, SignUpLoginActivity::class.java)
            startActivity(intent)
        }, 2000) // 2 seconds delay
    }
}
