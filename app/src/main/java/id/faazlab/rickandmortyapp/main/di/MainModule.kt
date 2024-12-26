package id.faazlab.rickandmortyapp.main.di

import id.faazlab.rickandmortyapp.main.navigation.NavigationManagerImpl
import id.faazlab.rickandmortyapp.navigation.NavigationManager
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 * Created by erikgunawan on 18/12/24.
 */
val mainModule =
    module {
        single<NavigationManager> { NavigationManagerImpl(androidApplication()) }
    }
