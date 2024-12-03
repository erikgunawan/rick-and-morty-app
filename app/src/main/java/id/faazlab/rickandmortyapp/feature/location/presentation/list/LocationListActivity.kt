package id.faazlab.rickandmortyapp.feature.location.presentation.list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import id.faazlab.rickandmortyapp.common.presentation.ui.theme.RickMortyAppTheme
import id.faazlab.rickandmortyapp.feature.location.domain.LocationUseCase
import kotlinx.coroutines.runBlocking
import org.koin.android.ext.android.inject

/**
 * Created by erikgunawan on 03/12/24.
 */
class LocationListActivity : ComponentActivity() {

    private val locationUseCase : LocationUseCase by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RickMortyAppTheme {
                Text("Location List")
            }
        }
        runBlocking {
            locationUseCase.getAllLocations()
            locationUseCase.getLocationById(1)
        }
    }

    companion object {
        fun newIntent(context: Context) =
            Intent(context, LocationListActivity::class.java)
    }
}