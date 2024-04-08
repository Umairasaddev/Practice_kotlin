package com.example.MVVM.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.MVVM.api.QuoteService
import com.example.MVVM.api.RetrofitHelper
import com.example.MVVM.repository.QuotesRepository
import com.example.MVVM.viewmodel.MainViewModel
import com.example.MVVM.viewmodel.MainViewModelFactory
import com.example.recyclerview.R

class MainActivityMvvm : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mvvm)

        val quoteService = RetrofitHelper.getInstance().create(QuoteService::class.java)
        val repository = QuotesRepository(quoteService)

        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)

        mainViewModel.quotes.observe(this, Observer {
            Log.d("check", it.results.toString())
        })
    }
}