package id.faazlab.rickandmortyapp

import android.app.Application
import id.faazlab.rickandmortyapp.common.di.commonModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by erikgunawan on 02/12/24.
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(commonModule)
        }

    }
}