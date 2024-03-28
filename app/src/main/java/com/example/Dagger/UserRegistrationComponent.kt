package com.example.Dagger

import dagger.Component


@Component
interface UserRegistrationComponent {


    fun inject(daggerActivity: DaggerActivity)
}


/*
    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService():EmailService

 */