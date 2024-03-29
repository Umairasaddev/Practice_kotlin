package com.example.LiveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.recyclerview.R

class LiveDataActivity : AppCompatActivity() {

     lateinit var mainViewModel: MainViewModel

     private val factsTextView: TextView
         get() = findViewById(R.id.textLiveData)

    private val btnUpdate: TextView
         get() = findViewById(R.id.btnLiveData)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)


        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.factsLiveData.observe(this, Observer{

            factsTextView.text = it
        })

        btnUpdate.setOnClickListener{
            mainViewModel.updateLiveData()
        }
    }
}