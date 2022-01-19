package com.junemon.myapplication.di

import com.junemon.myapplication.MainActivity
import com.junemon.myapplication.MainPresenter
import com.junemon.myapplication.MainView
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */

fun injectModules() = loadFeature

private val loadFeature by lazy {
    loadKoinModules(
        mainActivityModule
    )
}


val mainActivityModule = module {

    // declare MainView as single instance
    single<MainView> { MainActivity() }
    // declare MainPresenter as single instance
    // resolving MainView instance with get()
    single { MainPresenter(get()) }

}