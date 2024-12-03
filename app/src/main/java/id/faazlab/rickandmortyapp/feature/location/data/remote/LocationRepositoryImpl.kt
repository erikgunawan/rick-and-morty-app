package id.faazlab.rickandmortyapp.feature.location.data.remote

import id.faazlab.rickandmortyapp.common.domain.util.ResponseResult
import id.faazlab.rickandmortyapp.feature.location.domain.LocationRepository
import id.faazlab.rickandmortyapp.feature.location.domain.model.Location

/**
 * Created by erikgunawan on 03/12/24.
 */
class LocationRepositoryImpl(
    val locationRemoteDataSource: LocationRemoteDataSource
): LocationRepository {

    override suspend fun getAllLocations(): ResponseResult<List<Location>> {
        return locationRemoteDataSource.getAllLocations()
    }

    override suspend fun getLocationById(id: Int): ResponseResult<Location> {
        return locationRemoteDataSource.getLocationById(id)
    }
}