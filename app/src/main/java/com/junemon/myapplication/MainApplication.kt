package com.junemon.myapplication

import android.app.Application
import com.junemon.myapplication.di.AppComponent
import com.junemon.myapplication.di.DaggerAppComponent


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
class MainApplication : Application() {


    val appComponent: AppComponent by lazy {
        initializeComponent()
    }


    open fun initializeComponent(): AppComponent {
        // Creates an instance of AppComponent using its Factory constructor
        // We pass the application that will be used as Context in the graph
        return DaggerAppComponent.factory().injectApplication(this)
    }
}