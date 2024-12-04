package id.faazlab.rickandmortyapp.feature.episode.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.faazlab.rickandmortyapp.feature.episode.domain.EpisodeUseCase
import kotlinx.coroutines.launch

/**
 * Created by erikgunawan on 04/12/24.
 */
class EpisodeViewModel(val episodeUseCase: EpisodeUseCase): ViewModel() {

    fun getAllEpisodes() {
        viewModelScope.launch {
            episodeUseCase.getAllEpisodes()
        }
    }
}