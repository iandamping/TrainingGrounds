package com.junemon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(),MainView {

    private val TAG = this.javaClass.canonicalName


    private val presenter: MainPresenter by inject {
        parametersOf(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.logMe("Android")
    }

    override fun logMessage(name: String) {
        Log.e(TAG, name )
    }
}