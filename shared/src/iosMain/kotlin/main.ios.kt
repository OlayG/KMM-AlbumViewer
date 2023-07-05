import di.initializeKoin
import moe.tlaster.precompose.PreComposeApplication

actual fun getPlatformName(): String = "iOS"
fun MainViewController() = PreComposeApplication(title = "IOS TITLE") { App() }


fun InitializeKoin() = initializeKoin {  }