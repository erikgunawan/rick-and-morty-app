package id.faazlab.rickandmortyapp.feature.character.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.faazlab.rickandmortyapp.feature.character.domain.CharacterUseCase
import kotlinx.coroutines.launch

/**
 * Created by erikgunawan on 04/12/24.
 */
class CharacterViewModel(val characterUseCase: CharacterUseCase): ViewModel() {

    fun getAllCharacters() {
        viewModelScope.launch {
            characterUseCase.getAllCharacters()
        }
    }
}