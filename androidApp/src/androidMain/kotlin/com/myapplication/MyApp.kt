package com.myapplication

import android.app.Application
import di.initializeKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeKoin {
            androidContext(this@MyApp)
            androidLogger(if (BuildConfig.DEBUG) Level.DEBUG else Level.NONE)
        }
    }
}
