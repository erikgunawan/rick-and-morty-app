package id.faazlab.rickandmortyapp.common.data.remote.model

/**
 * Created by erikgunawan on 02/12/24.
 */
data class BaseResponse<T>(
    val info: Info,
    val results: List<T>
)