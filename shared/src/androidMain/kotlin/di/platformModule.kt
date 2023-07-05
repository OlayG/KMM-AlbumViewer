package di

import AndroidClient
import co.touchlab.kermit.LogWriter
import co.touchlab.kermit.LogcatWriter
import org.koin.core.module.Module
import org.koin.dsl.module
import util.getLoggerWithTag

actual val platformModule: Module = module {

    single { AndroidClient(json = get(), kermitLogger = getLoggerWithTag("AndroidClient")) }
}
actual val logWriters: List<LogWriter> = listOf(LogcatWriter())
