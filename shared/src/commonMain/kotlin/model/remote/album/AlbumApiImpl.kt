package model.remote.album

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

class AlbumApiImpl(private val client: HttpClient) : AlbumApi {

    override suspend fun fetchAlbums(): HttpResponse {
        return client.get(urlString = "/albums/1/photos")
    }
}
