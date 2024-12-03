package id.faazlab.rickandmortyapp.feature.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import id.faazlab.rickandmortyapp.common.presentation.ui.theme.RickMortyAppTheme
import id.faazlab.rickandmortyapp.feature.character.presentation.list.CharacterListActivity
import id.faazlab.rickandmortyapp.feature.episode.presentation.list.EpisodeListActivity
import id.faazlab.rickandmortyapp.feature.location.presentation.list.LocationListActivity

/**
 * Created by erikgunawan on 02/12/24.
 */
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RickMortyAppTheme {
                val buttonLabels = listOf("Character", "Episode", "Location")

                ButtonList(buttons = buttonLabels) { clickedButtonText ->
                    // Handle button click here
                    println("Clicked: $clickedButtonText")

                    when (clickedButtonText) {
                        "Character" -> startActivity(CharacterListActivity.newIntent(this))
                        "Episode" -> startActivity(EpisodeListActivity.newIntent(this))
                        "Location" -> startActivity(LocationListActivity.newIntent(this))
                    }
                }
            }
        }
    }
}

@Composable
fun ButtonList(buttons: List<String>, onButtonClick: (String) -> Unit) {
    LazyColumn {
        items(buttons) { buttonText ->
            Button(
                onClick = { onButtonClick(buttonText) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = buttonText)
            }
        }
    }
}