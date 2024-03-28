package com.example.Hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class HiltActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt)


    }
}