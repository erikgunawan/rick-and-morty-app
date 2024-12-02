package id.faazlab.rickandmortyapp.feature.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import id.faazlab.rickandmortyapp.common.data.remote.ApiClient
import kotlinx.coroutines.runBlocking
import org.koin.android.ext.android.inject

/**
 * Created by erikgunawan on 02/12/24.
 */
class MainActivity : ComponentActivity() {

    private val apiClient : ApiClient by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        runBlocking {
            apiClient.main()
        }

    }
}