package io.github.septianrin.coinsync.homescreen.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.septianrin.coinsync.R
import io.github.septianrin.coinsync.databinding.ActivityMainBinding

class HomescreenActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}