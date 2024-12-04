package id.faazlab.rickandmortyapp.feature.episode.data.remote

import id.faazlab.rickandmortyapp.common.data.remote.baseUrl
import id.faazlab.rickandmortyapp.common.data.remote.model.BaseResponse
import id.faazlab.rickandmortyapp.common.data.remote.safeApiCall
import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.episode.data.remote.model.EpisodeDto
import id.faazlab.rickandmortyapp.feature.episode.domain.model.Episode
import id.faazlab.rickandmortyapp.feature.episode.domain.model.toEpisode
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

/**
 * Created by erikgunawan on 04/12/24.
 */
class EpisodeRemoteDataSource(
    val apiClient: HttpClient
) {

    suspend fun getAllEpisodes(): ResponseResult<List<Episode>> {
        return safeApiCall {
            apiClient
                .get(baseUrl() + "/episode")
                .body<BaseResponse<EpisodeDto>>().results.map {
                    it.toEpisode()
                }
        }
    }

    suspend fun getEpisodeById(id: Int): ResponseResult<Episode> {
        return safeApiCall {
            apiClient
                .get(baseUrl() + "/episode/${id}")
                .body<EpisodeDto>()
                .toEpisode()
        }
    }

}