package id.faazlab.rickandmortyapp.feature.location.data.remote.model

import kotlinx.serialization.Serializable

/**
 * Created by erikgunawan on 02/12/24.
 */
@Serializable
data class LocationDto(
    val id: Int?,
    val name: String?,
    val type: String?,
    val dimension: String?,
    val residents: List<String>?,
    val url: String?,
    val created: String?
)