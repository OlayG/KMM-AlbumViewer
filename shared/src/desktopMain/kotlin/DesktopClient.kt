import co.touchlab.kermit.Logger as KermitLogger
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

internal object DesktopClient {

    operator fun invoke(
        json: Json,
        kermitLogger: KermitLogger
    ) = HttpClient(CIO) {
        defaultRequest {
            url("https://jsonplaceholder.typicode.com")
        }
        expectSuccess = true
        install(ContentNegotiation) {
            json(json)
        }
        install(Logging) {
            level = LogLevel.ALL
            logger = object : Logger {
                override fun log(message: String) {
                    kermitLogger.v { message }
                }
            }
        }
    }
}