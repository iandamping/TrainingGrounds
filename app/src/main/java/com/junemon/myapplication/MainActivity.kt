package com.junemon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(),MainView {

    private val TAG = this.javaClass.canonicalName

    private val presenter:MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.logMe("Android")
    }

    override fun logMessage(name: String) {
        Log.e(TAG, name )
    }
}