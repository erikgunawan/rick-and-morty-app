package id.faazlab.rickandmortyapp.feature.character.data.remote.model

import id.faazlab.rickandmortyapp.feature.location.data.remote.model.LocationDto

/**
 * Created by erikgunawan on 02/12/24.
 */
data class CharacterDto(
    val id: Int?,
    val name: String?,
    val status: String?,
    val species: String?,
    val type: String?,
    val gender: String?,
    val origin: LocationDto?,
    val location: LocationDto?,
    val image: String?,
    val episode: List<String>?,
    val url: String?,
    val created: String?
)