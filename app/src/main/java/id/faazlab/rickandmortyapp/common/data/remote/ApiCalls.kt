package id.faazlab.rickandmortyapp.common.data.remote

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult

/**
 * Created by erikgunawan on 02/12/24.
 */
fun baseUrl() = "https://rickandmortyapi.com/api"

inline fun <reified T> safeApiCall(
    execute: () -> T
): ResponseResult<T> {
    val response = try {
        ResponseResult.Success(execute())
    } catch(e: Exception) {
        return ResponseResult.Error(e)
    }

    return response
}