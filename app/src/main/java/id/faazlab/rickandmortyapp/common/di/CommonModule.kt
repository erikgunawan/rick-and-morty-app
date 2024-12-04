package id.faazlab.rickandmortyapp.common.di

import id.faazlab.rickandmortyapp.common.data.remote.HttpClientFactory
import org.koin.dsl.module

/**
 * Created by erikgunawan on 29/11/24.
 */
val commonModule = module {
    single { HttpClientFactory.create(get()) }
}