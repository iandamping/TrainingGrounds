package com.junemon.myapplication

import javax.inject.Inject


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
class MainPresenter @Inject constructor(private val mView: MainView) {

    fun injectingWith(name: String) {
        mView.logMessage("injected with: $name")
    }
}