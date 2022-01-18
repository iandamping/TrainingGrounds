package com.junemon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity(),MainView {

    private val TAG = this.javaClass.canonicalName

    @Inject
    lateinit var factory: MainPresenter.Factory

    private val presenter: MainPresenter by lazy {
        factory.create(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject().getMainActivityComponent().getComponent().injectActivity(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.logMe("Android")
    }

    override fun logMessage(name: String) {
        Log.e(TAG, name)
    }
}