package com.junemon.myapplication

import android.app.Application
import com.junemon.myapplication.di.injectModules
import org.koin.core.context.startKoin


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            injectModules()
        }
    }
}