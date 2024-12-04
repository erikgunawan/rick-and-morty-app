package id.faazlab.rickandmortyapp.feature.character.domain.model

import id.faazlab.rickandmortyapp.feature.character.data.remote.model.OriginDto

/**
 * Created by erikgunawan on 04/12/24.
 */
data class Origin(
    val name: String,
    val url: String
)

fun OriginDto.toOrigin() = Origin(
    name = name ?: "",
    url = url ?: ""
)