package id.faazlab.rickandmortyapp.common.di

import id.faazlab.rickandmortyapp.common.data.remote.ApiClient
import id.faazlab.rickandmortyapp.common.data.remote.HttpClientFactory
import io.ktor.client.engine.cio.CIO
import org.koin.dsl.module

/**
 * Created by erikgunawan on 29/11/24.
 */
val commonModule = module {
    val client = CIO.create().apply {
    }
    single { HttpClientFactory.create(get()) }
    single { ApiClient(get()) }
}