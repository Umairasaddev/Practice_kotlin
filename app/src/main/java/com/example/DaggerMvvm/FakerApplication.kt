package com.example.DaggerMvvm

import android.app.Application
import com.example.DaggerMvvm.di.ApplicationComponent
import com.example.DaggerMvvm.di.DaggerApplicationComponent

class FakerApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}