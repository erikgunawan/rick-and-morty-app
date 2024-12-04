package id.faazlab.rickandmortyapp.feature.location.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.faazlab.rickandmortyapp.feature.location.domain.LocationUseCase
import kotlinx.coroutines.launch

/**
 * Created by erikgunawan on 04/12/24.
 */
class LocationViewModel(val locationUseCase: LocationUseCase): ViewModel() {

    fun getAllLocations() {
        viewModelScope.launch {
            locationUseCase.getAllLocations()
        }
    }
}