package com.junemon.myapplication

import android.util.Log
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
class MainPresenter @AssistedInject constructor(@Assisted private val mView: MainView) {

    @AssistedFactory
    interface Factory {
        fun create(mainView: MainView): MainPresenter
    }

    fun injectingWith(name: String) {
        mView.logMessage("injected with: $name")
    }
}