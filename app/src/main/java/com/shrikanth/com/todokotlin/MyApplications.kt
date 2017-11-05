package com.shrikanth.com.todokotlin

import android.app.Application
import com.shrikanth.com.data.DBApi

/**
 * Created by shrikanth on 11/5/17.
 *
 */
class MyApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        DBApi.CREATE_INSTANCE(this)

    }
}
