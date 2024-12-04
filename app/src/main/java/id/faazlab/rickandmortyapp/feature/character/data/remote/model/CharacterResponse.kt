package id.faazlab.rickandmortyapp.feature.character.data.remote.model

import kotlinx.serialization.Serializable

/**
 * Created by erikgunawan on 02/12/24.
 */
@Serializable
data class CharacterDto(
    val id: Int?,
    val name: String?,
    val status: String?,
    val species: String?,
    val type: String?,
    val gender: String?,
    val origin: OriginDto?,
    val location: OriginDto?,
    val image: String?,
    val episode: List<String>?,
    val url: String?,
    val created: String?
)

@Serializable
data class OriginDto(
    val name: String?,
    val url: String?
)