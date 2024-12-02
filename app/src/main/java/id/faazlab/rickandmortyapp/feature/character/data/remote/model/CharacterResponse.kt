package id.faazlab.rickandmortyapp.feature.character.data.remote.model

import android.location.Location

/**
 * Created by erikgunawan on 02/12/24.
 */
data class Character(
    val id: Int?,
    val name: String?,
    val status: String?,
    val species: String?,
    val type: String?,
    val gender: String?,
    val origin: Location?,
    val location: Location?,
    val image: String?,
    val episode: List<String?>?,
    val url: String?,
    val created: String?
)