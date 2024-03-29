package com.example.MVVM.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.MVVM.api.QuoteService
import com.example.MVVM.models.Quotes

class QuotesRepository(private val quotesService: QuoteService) {

    private val quotesLiveData = MutableLiveData<Quotes>()

    val quotes:LiveData<Quotes>
        get() = quotesLiveData



//getting api result
    suspend fun getQuotes(page: Int) {
        val result = quotesService.getQuotes(page)
        if (result?.body() != null) {
            quotesLiveData.postValue(result.body())
        }
    }

}