package id.faazlab.rickandmortyapp.common.domain.util

/**
 * Created by erikgunawan on 03/12/24.
 */
sealed interface ResponseResult<out D> {
    data class Success<out D>(val data: D): ResponseResult<D>
    data class Error<out E: Exception>(val error: Exception): ResponseResult<E>
}

interface Error