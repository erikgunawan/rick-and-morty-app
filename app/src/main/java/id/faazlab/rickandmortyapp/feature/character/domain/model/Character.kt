package id.faazlab.rickandmortyapp.feature.character.domain.model

import id.faazlab.rickandmortyapp.feature.character.data.remote.model.CharacterDto

/**
 * Created by erikgunawan on 03/12/24.
 */
data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Origin?,
    val location: Origin?,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)

fun CharacterDto.toCharacter() = Character(
    id = id ?: 0,
    name = name ?: "",
    status = status ?: "",
    species = species ?: "",
    type = type ?: "",
    gender = gender ?: "",
    origin = origin?.toOrigin(),
    location = location?.toOrigin(),
    image = image ?: "",
    episode = episode ?: listOf(),
    url = url ?: "",
    created = created ?: ""
)