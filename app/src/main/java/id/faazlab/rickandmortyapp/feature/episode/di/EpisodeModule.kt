package id.faazlab.rickandmortyapp.feature.episode.di

import id.faazlab.rickandmortyapp.feature.episode.data.remote.EpisodeRemoteDataSource
import id.faazlab.rickandmortyapp.feature.episode.data.remote.EpisodeRepositoryImpl
import id.faazlab.rickandmortyapp.feature.episode.domain.EpisodeRepository
import id.faazlab.rickandmortyapp.feature.episode.domain.EpisodeUseCase
import id.faazlab.rickandmortyapp.feature.episode.domain.EpisodeUseCaseImpl
import id.faazlab.rickandmortyapp.feature.episode.presentation.EpisodeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by erikgunawan on 04/12/24.
 */
val episodeModule = module {
    single<EpisodeRemoteDataSource> { EpisodeRemoteDataSource(get()) }
    single<EpisodeRepository> { EpisodeRepositoryImpl(get()) }
    single<EpisodeUseCase> { EpisodeUseCaseImpl(get()) }

    viewModel { EpisodeViewModel(get()) }
}