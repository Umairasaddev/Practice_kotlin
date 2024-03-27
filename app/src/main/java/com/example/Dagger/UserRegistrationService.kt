package com.example.Dagger

import javax.inject.Inject

//constructor injection
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "umairasad@gmail.com", "User Registered")
    }

}

/*
  Unit Testing  : both classes should be ready for that
    private val userRepository = UserRepository()
    private val emailService = EmailService()


Single Responsibility
    class is doing multiple work as  creating objects of other classes and registering user

LifeTime of these objects
    objects of user repositort and email service is tightly coupled with class


Extensible
        dependencies are hardcoded

        class UserRegistrationService {

    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "umairasad@gmail.com", "User Registered")
    }

}

 */

