package model.remote.response

import kotlinx.serialization.Serializable
import model.local.Album

object AlbumResponse {

    @Serializable
    data class AlbumDTO(
        val id: Int,
        val albumId: Int,
        val title: String,
        val url: String,
        val thumbnailUrl: String,
    ) {
        companion object {
            fun AlbumDTO.toEntity() = Album(
                id = id,
                albumId = albumId,
                title = title,
                url = url,
                thumbnailUrl = thumbnailUrl,
            )
        }
    }
}