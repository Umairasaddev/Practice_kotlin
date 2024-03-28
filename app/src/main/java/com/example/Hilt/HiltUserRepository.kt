package com.example.Hilt

import android.util.Log
import javax.inject.Inject

const val TAG = "hilt"
class HiltUserRepository @Inject constructor(){

    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved through hilt in DB: ")
    }
}