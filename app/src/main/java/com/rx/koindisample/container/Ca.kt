package com.rx.koindisample.container

import android.app.Application
import com.rx.koindisample.di.koinDIModule
import org.koin.core.context.startKoin

class KoinDIApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(koinDIModule)
        }
    }

}