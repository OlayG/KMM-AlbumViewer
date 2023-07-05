import androidx.compose.ui.window.application
import di.initializeKoin
import moe.tlaster.precompose.PreComposeWindow

fun main() {
    initializeKoin { }
    application {
        PreComposeWindow(onCloseRequest = ::exitApplication) {
            MainView()
        }
    }
}