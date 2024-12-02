package id.faazlab.rickandmortyapp.common.data.remote.model

import id.faazlab.rickandmortyapp.feature.character.data.remote.model.Character

/**
 * Created by erikgunawan on 02/12/24.
 */
data class BaseResponse<T>(
    val info: Info,
    val results: List<T>
)