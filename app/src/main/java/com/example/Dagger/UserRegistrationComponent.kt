package com.example.Dagger

import dagger.Component


@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService():EmailService
}