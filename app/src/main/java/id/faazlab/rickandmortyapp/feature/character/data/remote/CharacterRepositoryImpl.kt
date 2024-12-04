package id.faazlab.rickandmortyapp.feature.character.data.remote

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.character.domain.CharacterRepository
import id.faazlab.rickandmortyapp.feature.character.domain.model.Character

/**
 * Created by erikgunawan on 04/12/24.
 */
class CharacterRepositoryImpl(
    val characterRemoteDataSource: CharacterRemoteDataSource
): CharacterRepository {

    override suspend fun getAllCharacters(): ResponseResult<List<Character>> {
        return characterRemoteDataSource.getAllCharacters()
    }

    override suspend fun getCharacterById(id: Int): ResponseResult<Character> {
        return characterRemoteDataSource.getCharacterById(id)
    }
}