package id.faazlab.rickandmortyapp.feature.location.data.remote

import id.faazlab.rickandmortyapp.common.data.remote.baseUrl
import id.faazlab.rickandmortyapp.common.data.remote.model.BaseResponse
import id.faazlab.rickandmortyapp.common.data.remote.safeApiCall
import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.location.data.remote.model.LocationDto
import id.faazlab.rickandmortyapp.feature.location.domain.model.Location
import id.faazlab.rickandmortyapp.feature.location.domain.model.toLocation
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

/**
 * Created by erikgunawan on 03/12/24.
 */
class LocationRemoteDataSource(
    val apiClient: HttpClient
) {

    suspend fun getAllLocations(): ResponseResult<List<Location>> {
        return safeApiCall {
            apiClient
                .get(baseUrl() + "/location")
                .body<BaseResponse<LocationDto>>().results.map {
                    it.toLocation()
                }
        }
    }

    suspend fun getLocationById(id: Int): ResponseResult<Location> {
        return safeApiCall {
            apiClient
                .get(baseUrl() + "/location/${id}")
                .body<LocationDto>()
                .toLocation()
        }
    }

}