package io.github.septianrin.coinsync.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import io.github.septianrin.coinsync.R
import io.github.septianrin.coinsync.databinding.ActivitySplashScreenBinding
import io.github.septianrin.coinsync.homescreen.presentation.HomescreenActivity
import io.github.septianrin.coinsync.utils.Preference

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private val binding : ActivitySplashScreenBinding by lazy{
        ActivitySplashScreenBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = this.localClassName
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Preference(this).initFirstRun()
        Log.e(TAG, "onCreate: ${Preference(this).getBoolean(Preference.firstRun)}", )
        if(Preference(this).getBoolean(Preference.firstRun)){
            Toast.makeText(this, "This is toast from shared Preference", Toast.LENGTH_SHORT).show()
        }

        Handler().postDelayed({

            val intent = Intent(this, HomescreenActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

}