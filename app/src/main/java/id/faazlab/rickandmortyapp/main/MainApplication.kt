package id.faazlab.rickandmortyapp.main

import android.app.Application
import id.faazlab.rickandmortyapp.common.di.commonModule
import id.faazlab.rickandmortyapp.feature.character.di.characterModule
import id.faazlab.rickandmortyapp.feature.episode.di.episodeModule
import id.faazlab.rickandmortyapp.feature.location.di.locationModule
import id.faazlab.rickandmortyapp.main.di.mainModule
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
            modules(mainModule, commonModule, locationModule, episodeModule, characterModule)
        }

    }
}