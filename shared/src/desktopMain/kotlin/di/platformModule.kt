package di

import DesktopClient
import co.touchlab.kermit.LogWriter
import org.koin.core.module.Module
import org.koin.dsl.module
import util.getLoggerWithTag

actual val platformModule: Module = module {
    single { DesktopClient(json = get(), kermitLogger = getLoggerWithTag("DesktopClient")) }
}

actual val logWriters: List<LogWriter> = listOf()
