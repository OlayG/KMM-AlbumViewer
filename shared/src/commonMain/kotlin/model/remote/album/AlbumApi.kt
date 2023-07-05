package model.remote.album

import io.ktor.client.statement.HttpResponse

interface AlbumApi {

    suspend fun fetchAlbums(): HttpResponse
}