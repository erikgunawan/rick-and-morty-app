package id.faazlab.rickandmortyapp.feature.location.domain.model

import id.faazlab.rickandmortyapp.feature.location.data.remote.model.LocationDto

/**
 * Created by erikgunawan on 03/12/24.
 */
data class Location(
    val id: Int,
    val name: String,
    val type: String,
    val dimension: String,
    val residents: List<String>,
    val url: String,
    val created: String
)

fun LocationDto.toLocation() = Location(
    id = id ?: 0,
    name = name ?: "",
    type = type ?: "",
    dimension = dimension ?: "",
    residents = residents ?: listOf(),
    url = url ?: "",
    created = created ?: ""
)