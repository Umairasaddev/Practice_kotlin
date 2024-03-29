package com.example.LiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val factsLiveData = MutableLiveData("this is a fact")


    fun updateLiveData(){
        factsLiveData.value = "Another Bug"
    }
}