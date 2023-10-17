package io.github.septianrin.coinsync

import android.app.Application
import com.androidplot.BuildConfig
import io.github.septianrin.coinsync.homescreen.data.repository.HomescreenRepository
import io.github.septianrin.coinsync.homescreen.presentation.viewmodel.HomescreenViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import timber.log.Timber

class CoinSyncApplication : Application() {

    val appModule = module {
        single { HomescreenRepository() }
        viewModel { HomescreenViewModel(get()) }
    }

    override fun onCreate() {
        super.onCreate()

        //koin initialization
        startKoin{
            androidContext(this@CoinSyncApplication)
            modules(appModule)
        }

        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }


    }
}