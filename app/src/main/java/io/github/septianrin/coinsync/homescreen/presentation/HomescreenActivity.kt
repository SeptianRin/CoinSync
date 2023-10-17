package io.github.septianrin.coinsync.homescreen.presentation

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.github.septianrin.coinsync.R
import io.github.septianrin.coinsync.databinding.ActivityMainBinding
import io.github.septianrin.coinsync.homescreen.presentation.viewmodel.HomescreenViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber


class HomescreenActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val homescreenViewModel: HomescreenViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        homescreenViewModel.getMessage().observe(this) {
            Timber.e("this data is from repository")
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            binding.tvHello.text = it
        }
    }
}