package id.faazlab.rickandmortyapp.feature.location.domain

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.location.domain.model.Location

/**
 * Created by erikgunawan on 03/12/24.
 */
interface LocationRepository {
    suspend fun getAllLocations(): ResponseResult<List<Location>>
    suspend fun getLocationById(id: Int): ResponseResult<Location>
}