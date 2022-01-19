package com.junemon.myapplication.di

import com.junemon.myapplication.MainActivity
import com.junemon.myapplication.MainView
import dagger.BindsInstance
import dagger.Subcomponent


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
@Subcomponent
interface MainActivityComponent {

    fun injectActivity(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun injectView(@BindsInstance mainView: MainView): MainActivityComponent
    }
}