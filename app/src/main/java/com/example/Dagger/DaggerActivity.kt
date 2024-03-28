package com.example.Dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.R
import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService

    lateinit var emailService: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)


        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        userRegistrationService.registerUser("softech@gmail.com","12345")
    }
}

/*
class DaggerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)

this is called manual dependency injection as we are creating objects our self
        val userRepository=UserRepository()
        val emailService = EmailService()

        val userRegistrationService = UserRegistrationService(userRepository,emailService)
        userRegistrationService.registerUser("softech@gmail.com","12345")
    }
 */

/*
jab inject ka method bna dia component main
//        val userRepository=UserRepository()
//        val emailService = EmailService()
//
//        val userRegistrationService = UserRegistrationService(userRepository,emailService)
        val component = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()
 */