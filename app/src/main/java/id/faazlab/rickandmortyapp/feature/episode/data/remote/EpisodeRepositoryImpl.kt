package id.faazlab.rickandmortyapp.feature.episode.data.remote

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.episode.domain.EpisodeRepository
import id.faazlab.rickandmortyapp.feature.episode.domain.model.Episode

/**
 * Created by erikgunawan on 04/12/24.
 */
class EpisodeRepositoryImpl(
    val episodeRemoteDataSource: EpisodeRemoteDataSource
): EpisodeRepository {

    override suspend fun getAllEpisodes(): ResponseResult<List<Episode>> {
        return episodeRemoteDataSource.getAllEpisodes()
    }

    override suspend fun getEpisodeById(id: Int): ResponseResult<Episode> {
        return episodeRemoteDataSource.getEpisodeById(id)
    }
}