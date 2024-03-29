package com.example.MVVM.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.MVVM.models.Quotes
import com.example.MVVM.repository.QuotesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: QuotesRepository):ViewModel(){

    init {
        viewModelScope.launch(Dispatchers.IO){
            repository.getQuotes(1)
//            repository ny live data main response lia from QuotesRepository or view model main pass kar dia
        }

    }

    val quotes:LiveData<Quotes>
        get() = repository.quotes
}