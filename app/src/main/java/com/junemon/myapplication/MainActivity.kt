package com.junemon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(),MainView {

    @Inject
    lateinit var factory: MainPresenter.Factory

    private val presenter: MainPresenter by lazy {
        factory.create(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.logMe()
    }
}