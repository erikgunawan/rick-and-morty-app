package id.faazlab.rickandmortyapp.feature.location.domain

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.location.domain.model.Location

/**
 * Created by erikgunawan on 03/12/24.
 */
interface LocationUseCase {
    suspend fun getAllLocations(): ResponseResult<List<Location>>
    suspend fun getLocationById(id: Int): ResponseResult<Location>
}

class LocationUseCaseImpl(
    private val locationRepository: LocationRepository
): LocationUseCase {

    override suspend fun getAllLocations(): ResponseResult<List<Location>> {
        return locationRepository.getAllLocations()
    }

    override suspend fun getLocationById(id: Int): ResponseResult<Location> {
        return locationRepository.getLocationById(id)
    }
}