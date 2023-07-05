package ui.albumList

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.launch
import model.AlbumRepo
import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModelScope
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class AlbumListViewModel : ViewModel(), KoinComponent {

    private val repo: AlbumRepo by inject()
    var state by mutableStateOf(AlbumListContract.State())
        private set

    init {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            val albums = repo.getAlbums()
            state = state.copy(albums = albums, isLoading = false)
        }
    }
}
