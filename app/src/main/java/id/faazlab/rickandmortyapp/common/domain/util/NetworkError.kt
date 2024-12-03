package id.faazlab.rickandmortyapp.common.domain.util

/**
 * Created by erikgunawan on 03/12/24.
 */
enum class NetworkError: Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN,
}