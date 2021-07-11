package com.seif.levanlong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_splash.*

class splash : AppCompatActivity() {
    val splashTime = 1500L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Make this activity, full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        // Hide the Title bar of this activity screen
        window.requestFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)
        // animation for the company name ( fade in and fade out ).
        txt_Company.alpha = 0f
        txt_Company.animate().setDuration(1500).alpha(1.5f)
        Handler().postDelayed({
            val home = Intent(this@splash, MainActivity::class.java)
            startActivity(home)
            finish()
        }, splashTime)
    }
}