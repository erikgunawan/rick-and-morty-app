package id.faazlab.rickandmortyapp.common.data.remote

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

/**
 * Created by erikgunawan on 29/11/24.
 */
class ApiClient(val httpClient: HttpClient) {
    suspend fun main() {
        val response: HttpResponse = httpClient.get("https://ktor.io/")
        Log.d("AppStarter", response.status.toString())
        httpClient.close()
    }
}