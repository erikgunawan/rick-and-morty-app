package id.faazlab.rickandmortyapp.feature.episode.data.remote.model

import com.google.gson.annotations.SerializedName

/**
 * Created by erikgunawan on 02/12/24.
 */
data class Episode(
    val id: Int?,
    val name: String?,
    @SerializedName("air_date") val airDate: String?,
    val episode: String?,
    val characters: List<String?>?,
    val url: String?,
    val created: String?
)