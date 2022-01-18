package com.junemon.myapplication

import android.util.Log


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
class MainPresenter(private val view: MainView) {
    private val TAG = this.javaClass.canonicalName

    fun logMe() {
        Log.e(TAG, "Hello there")
    }
}