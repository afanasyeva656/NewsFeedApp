package com.afanasyeva656.newsfeedapp

import android.app.Application
import com.afanasyeva656.newsfeedapp.di.appModule
import com.afanasyeva656.newsfeedapp.features.main_screen.di.mainScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(appModule, mainScreenModule)
        }
    }
}