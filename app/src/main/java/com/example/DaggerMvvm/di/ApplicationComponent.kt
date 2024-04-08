package com.example.DaggerMvvm.di

import com.example.DaggerMvvm.DaggerMainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: DaggerMainActivity)
}