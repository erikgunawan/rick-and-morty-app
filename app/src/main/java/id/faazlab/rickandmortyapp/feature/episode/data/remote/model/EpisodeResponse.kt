package id.faazlab.rickandmortyapp.feature.episode.data.remote.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

/**
 * Created by erikgunawan on 02/12/24.
 */
@Serializable
data class EpisodeDto(
    val id: Int?,
    val name: String?,
    @SerializedName("air_date") val airDate: String?,
    val episode: String?,
    val characters: List<String>?,
    val url: String?,
    val created: String?
)