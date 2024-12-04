package id.faazlab.rickandmortyapp.feature.episode.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by erikgunawan on 02/12/24.
 */
@Serializable
data class EpisodeDto(
    val id: Int?,
    val name: String?,
    @SerialName("air_date") val airDate: String?,
    val episode: String?,
    val characters: List<String>?,
    val url: String?,
    val created: String?
)