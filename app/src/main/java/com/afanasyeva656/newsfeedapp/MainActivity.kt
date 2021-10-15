package com.afanasyeva656.newsfeedapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afanasyeva656.newsfeedapp.features.main_screen.MainScreenFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // commit обязателен
        supportFragmentManager.beginTransaction().replace(R.id.container, MainScreenFragment()).commit()
    }
}