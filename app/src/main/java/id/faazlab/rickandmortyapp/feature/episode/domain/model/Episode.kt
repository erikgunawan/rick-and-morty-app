package id.faazlab.rickandmortyapp.feature.episode.domain.model

import id.faazlab.rickandmortyapp.feature.episode.data.remote.model.EpisodeDto

/**
 * Created by erikgunawan on 03/12/24.
 */
data class Episode(
    val id: Int,
    val name: String,
    val airDate: String,
    val episode: String,
    val characters: List<String>,
    val url: String,
    val created: String
)

fun EpisodeDto.toEpisode() = Episode(
    id = id ?: 0,
    name = name ?: "",
    airDate = airDate ?: "",
    episode = episode ?: "",
    characters = characters ?: listOf(),
    url = url ?: "",
    created = created ?: ""
)