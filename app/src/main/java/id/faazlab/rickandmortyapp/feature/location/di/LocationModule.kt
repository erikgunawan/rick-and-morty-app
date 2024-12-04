package id.faazlab.rickandmortyapp.feature.location.di

import id.faazlab.rickandmortyapp.feature.location.data.remote.LocationRemoteDataSource
import id.faazlab.rickandmortyapp.feature.location.data.remote.LocationRepositoryImpl
import id.faazlab.rickandmortyapp.feature.location.domain.LocationRepository
import id.faazlab.rickandmortyapp.feature.location.domain.LocationUseCase
import id.faazlab.rickandmortyapp.feature.location.domain.LocationUseCaseImpl
import id.faazlab.rickandmortyapp.feature.location.presentation.LocationViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by erikgunawan on 03/12/24.
 */
val locationModule = module {
    single<LocationRemoteDataSource> { LocationRemoteDataSource(get()) }
    single<LocationRepository> { LocationRepositoryImpl(get()) }
    single<LocationUseCase> { LocationUseCaseImpl(get()) }

    viewModel { LocationViewModel(get()) }
}