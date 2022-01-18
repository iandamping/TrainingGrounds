package com.junemon.myapplication

import androidx.fragment.app.FragmentActivity
import com.junemon.myapplication.di.AppComponent


/**
 * Created by Ian Damping on 18,January,2022
 * Github https://github.com/iandamping
 * Indonesia.
 */
fun FragmentActivity.inject(): AppComponent = (application as MainApplication).appComponent