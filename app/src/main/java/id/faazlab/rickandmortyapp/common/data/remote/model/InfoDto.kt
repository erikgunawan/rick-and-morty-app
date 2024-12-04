package id.faazlab.rickandmortyapp.common.data.remote.model

import kotlinx.serialization.Serializable

/**
 * Created by erikgunawan on 02/12/24.
 */
@Serializable
data class InfoDto(
    val count: Int?,
    val pages: Int?,
    val next: String?,
    val prev: String?
)