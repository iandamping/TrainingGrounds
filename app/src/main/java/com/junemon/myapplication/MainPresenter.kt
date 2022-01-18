package com.junemon.myapplication

import android.util.Log


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
class MainPresenter(private val mView: MainView) {
    private val TAG = this.javaClass.canonicalName

    fun logMe(name:String) {
        mView.logMessage("hello: $name , how are you ?")
    }
}