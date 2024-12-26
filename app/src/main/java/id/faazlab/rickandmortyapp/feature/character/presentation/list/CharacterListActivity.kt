package id.faazlab.rickandmortyapp.feature.character.presentation.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import id.faazlab.rickandmortyapp.common.presentation.ui.theme.RickMortyAppTheme
import id.faazlab.rickandmortyapp.feature.character.presentation.CharacterViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by erikgunawan on 03/12/24.
 */
class CharacterListActivity : ComponentActivity() {
    private val characterViewModel: CharacterViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RickMortyAppTheme {
                Text("Character List")
            }
        }

        characterViewModel.getAllCharacters()
    }
}
