package model

import io.ktor.client.call.body
import model.local.Album
import model.remote.album.AlbumApi
import model.remote.response.AlbumResponse
import model.remote.response.AlbumResponse.AlbumDTO.Companion.toEntity

class AlbumRepo(private val api: AlbumApi) {

    suspend fun getAlbums(): List<Album> {
        val response = api.fetchAlbums()
        return response.body<List<AlbumResponse.AlbumDTO>>().map { it.toEntity() }
    }
}
