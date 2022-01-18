package com.junemon.myapplication.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
@Component(modules = [AppSubComponent::class])
interface AppComponent {

    fun getMainActivityComponent(): MainActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun injectApplication(@BindsInstance application: Application): AppComponent
    }
}