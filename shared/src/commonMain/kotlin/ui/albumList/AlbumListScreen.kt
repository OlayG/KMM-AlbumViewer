package ui.albumList

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.viewmodel.viewModel

@Composable
fun AlbumListDestination(
    modifier: Modifier = Modifier,
    viewModel: AlbumListViewModel = viewModel(AlbumListViewModel::class) { AlbumListViewModel() }
) {
    viewModel.state.albums.onEach {
        println("ALBUM is $it")
    }
}