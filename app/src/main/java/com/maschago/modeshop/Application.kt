package com.maschago.modeshop

import android.app.Application
import com.maschago.modeshop.di.provideAppModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class Application : Application() {
    override fun onCreate() {
        super.onCreate()

        initDI()
        initLogging()
    }

    private fun initDI() {
        startKoin {
            // declare used Android context
            androidContext(this@Application)
            modules(provideAppModules())
        }
    }

    private fun initLogging() {
        if (BuildConfig.DEBUG && Timber.treeCount == 0) Timber.plant(Timber.DebugTree())
    }
}