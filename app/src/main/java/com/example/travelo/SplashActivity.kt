package com.example.travelo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ProgressBar
import com.github.ybq.android.spinkit.style.ThreeBounce

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//hidding action bar
        supportActionBar?.hide()
            // setting up loading
        val progressBar = findViewById<View>(R.id.spin) as ProgressBar
        val threeBounce = ThreeBounce()
        progressBar.indeterminateDrawable =threeBounce

        // setting up time
        Handler(Looper.getMainLooper()).postDelayed(
            Runnable {

                startActivity(Intent(this, MainActivity::class.java))
            }, 8000
        )
    }
}