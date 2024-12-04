package id.faazlab.rickandmortyapp.common.data.remote.model

import kotlinx.serialization.Serializable

/**
 * Created by erikgunawan on 02/12/24.
 */
@Serializable
data class BaseResponse<T>(
    val info: InfoDto,
    val results: List<T>
)