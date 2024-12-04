package id.faazlab.rickandmortyapp.feature.character.di

import id.faazlab.rickandmortyapp.feature.character.data.remote.CharacterRemoteDataSource
import id.faazlab.rickandmortyapp.feature.character.data.remote.CharacterRepositoryImpl
import id.faazlab.rickandmortyapp.feature.character.domain.CharacterRepository
import id.faazlab.rickandmortyapp.feature.character.domain.CharacterUseCase
import id.faazlab.rickandmortyapp.feature.character.domain.CharacterUseCaseImpl
import org.koin.dsl.module

/**
 * Created by erikgunawan on 04/12/24.
 */
val characterModule = module {
    single<CharacterRemoteDataSource> { CharacterRemoteDataSource(get()) }
    single<CharacterRepository> { CharacterRepositoryImpl(get()) }
    single<CharacterUseCase> { CharacterUseCaseImpl(get()) }
}