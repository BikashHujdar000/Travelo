package com.example.travelo

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ProgressBar
import com.github.ybq.android.spinkit.style.ThreeBounce

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // hidding atatus bar
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )

            val progressBar = findViewById<View>(R.id.spin) as ProgressBar
            val threeBounce = ThreeBounce()
            progressBar.indeterminateDrawable = threeBounce

            // setting up time
            Handler(Looper.getMainLooper()).postDelayed(
                Runnable {

                    startActivity(Intent(this, MainActivity::class.java))
                }, 2000
            )
        }
    }
}