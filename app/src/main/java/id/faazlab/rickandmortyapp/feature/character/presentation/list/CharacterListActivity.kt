package id.faazlab.rickandmortyapp.feature.character.presentation.list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import id.faazlab.rickandmortyapp.common.presentation.ui.theme.RickMortyAppTheme

/**
 * Created by erikgunawan on 03/12/24.
 */
class CharacterListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RickMortyAppTheme {
                Text("Character List")
            }
        }
    }

    companion object {
        fun newIntent(context: Context) =
            Intent(context, CharacterListActivity::class.java)
    }
}