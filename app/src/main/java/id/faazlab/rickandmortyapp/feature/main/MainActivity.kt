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
import id.faazlab.rickandmortyapp.navigation.NavigationManager
import org.koin.android.ext.android.inject

/**
 * Created by erikgunawan on 02/12/24.
 */
class MainActivity : ComponentActivity() {

    private val navigationManager: NavigationManager by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RickMortyAppTheme {
                val buttonLabels = listOf("Character", "Episode", "Location")

                ButtonList(buttons = buttonLabels) { clickedButtonText ->
                    // Handle button click here
                    println("Clicked: $clickedButtonText")

                    when (clickedButtonText) {
                        "Character" -> navigationManager.gotoCharacterListPage()
                        "Episode" -> navigationManager.gotoEpisodeListPage()
                        "Location" -> navigationManager.gotoLocationListPage()
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