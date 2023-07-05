package di

import IosClient
import co.touchlab.kermit.LogWriter
import co.touchlab.kermit.NSLogWriter
import org.koin.core.module.Module
import org.koin.dsl.module
import util.getLoggerWithTag

actual val platformModule: Module = module {
    single { IosClient(json = get(), kermitLogger = getLoggerWithTag("IosClient")) }
}

actual val logWriters: List<LogWriter> = listOf(NSLogWriter())
