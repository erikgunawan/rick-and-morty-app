package id.faazlab.rickandmortyapp.feature.character.domain

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.character.domain.model.Character

/**
 * Created by erikgunawan on 04/12/24.
 */
interface CharacterRepository {
    suspend fun getAllCharacters(): ResponseResult<List<Character>>
    suspend fun getCharacterById(id: Int): ResponseResult<Character>
}