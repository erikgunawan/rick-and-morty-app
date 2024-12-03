package id.faazlab.rickandmortyapp.feature.location.data.remote.model

/**
 * Created by erikgunawan on 02/12/24.
 */
data class LocationDto(
    val id: Int?,
    val name: String?,
    val type: String?,
    val dimension: String?,
    val residents: List<String>?,
    val url: String?,
    val created: String?
)