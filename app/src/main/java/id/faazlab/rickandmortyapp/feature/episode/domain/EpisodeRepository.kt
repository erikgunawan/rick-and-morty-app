package id.faazlab.rickandmortyapp.feature.episode.domain

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.episode.domain.model.Episode

/**
 * Created by erikgunawan on 04/12/24.
 */
interface EpisodeRepository {
    suspend fun getAllEpisodes(): ResponseResult<List<Episode>>
    suspend fun getEpisodeById(id: Int): ResponseResult<Episode>
}