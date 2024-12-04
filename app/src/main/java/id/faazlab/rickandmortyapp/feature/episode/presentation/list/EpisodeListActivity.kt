package id.faazlab.rickandmortyapp.feature.episode.presentation.list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import id.faazlab.rickandmortyapp.common.presentation.ui.theme.RickMortyAppTheme
import id.faazlab.rickandmortyapp.feature.episode.domain.EpisodeUseCase
import kotlinx.coroutines.runBlocking
import org.koin.android.ext.android.inject

/**
 * Created by erikgunawan on 03/12/24.
 */
class EpisodeListActivity : ComponentActivity() {

    private val episodeUseCase : EpisodeUseCase by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RickMortyAppTheme {
                Text("Episode List")
            }
        }

        runBlocking {
            episodeUseCase.getAllEpisodes()
            episodeUseCase.getEpisodeById(1)
        }
    }

    companion object {
        fun newIntent(context: Context) =
            Intent(context, EpisodeListActivity::class.java)
    }
}