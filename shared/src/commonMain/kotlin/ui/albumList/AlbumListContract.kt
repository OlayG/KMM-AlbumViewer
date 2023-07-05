package ui.albumList

import model.local.Album

object AlbumListContract {
    data class State(
        val albums: List<Album> = listOf(),
        val isLoading: Boolean = false,
    )
}
