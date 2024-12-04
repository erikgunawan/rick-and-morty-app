package id.faazlab.rickandmortyapp.feature.character.data.remote

import id.faazlab.rickandmortyapp.common.data.remote.baseUrl
import id.faazlab.rickandmortyapp.common.data.remote.model.BaseResponse
import id.faazlab.rickandmortyapp.common.data.remote.safeApiCall
import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.character.domain.model.Character
import id.faazlab.rickandmortyapp.feature.character.data.remote.model.CharacterDto
import id.faazlab.rickandmortyapp.feature.character.domain.model.toCharacter
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

/**
 * Created by erikgunawan on 04/12/24.
 */
class CharacterRemoteDataSource(
    val apiClient: HttpClient
) {

    suspend fun getAllCharacters(): ResponseResult<List<Character>> {
        return safeApiCall {
            apiClient
                .get(baseUrl() + "/character")
                .body<BaseResponse<CharacterDto>>().results.map {
                    it.toCharacter()
                }
        }
    }

    suspend fun getCharacterById(id: Int): ResponseResult<Character> {
        return safeApiCall {
            apiClient
                .get(baseUrl() + "/character/${id}")
                .body<CharacterDto>()
                .toCharacter()
        }
    }

}