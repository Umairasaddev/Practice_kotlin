package com.example.DaggerMvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.DaggerMvvm.viewmodel.MainViewModel
import com.example.DaggerMvvm.viewmodel.MainViewModelFactory
import com.example.recyclerview.R
import javax.inject.Inject

class DaggerMainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    private val products:TextView
        get() = findViewById(R.id.products)

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_main)

        (application as FakerApplication).applicationComponent.inject(this)

        mainViewModel = ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)

        mainViewModel.productsLiveData.observe(this, Observer {
           products.text =  it.joinToString {  x->x.title + "\n\n" }
        })
    }
}