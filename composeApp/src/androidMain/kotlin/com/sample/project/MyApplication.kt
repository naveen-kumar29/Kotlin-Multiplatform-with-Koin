package com.sample.project

import android.app.Application
import com.sample.project.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MyApplication)
        }
    }
}