package io.github.septianrin.coinsync.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.septianrin.coinsync.R
import io.github.septianrin.coinsync.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {

    private val binding : ActivityOnboardingBinding by lazy {
        ActivityOnboardingBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }
}