package id.faazlab.rickandmortyapp.feature.character.domain

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.character.domain.model.Character

/**
 * Created by erikgunawan on 04/12/24.
 */
interface CharacterUseCase {
    suspend fun getAllCharacters(): ResponseResult<List<Character>>
    suspend fun getCharacterById(id: Int): ResponseResult<Character>
}

class CharacterUseCaseImpl(
    private val characterRepository: CharacterRepository
): CharacterUseCase {

    override suspend fun getAllCharacters(): ResponseResult<List<Character>> {
        return characterRepository.getAllCharacters()
    }

    override suspend fun getCharacterById(id: Int): ResponseResult<Character> {
        return characterRepository.getCharacterById(id)
    }
}