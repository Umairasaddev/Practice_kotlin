package com.example.Dagger

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){

    companion object{
        val TAG: String = "Check"
    }


    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in Database: ")
    }
}