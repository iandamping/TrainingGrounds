package com.junemon.myapplication


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
class MainPresenter(private val mView: MainView) {

    fun logMe(name:String) {
        mView.logMessage("hello: $name , how are you ?")
    }

}