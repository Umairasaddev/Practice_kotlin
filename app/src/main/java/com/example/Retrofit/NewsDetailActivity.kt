package com.example.Retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.recyclerview.R

class NewsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)
        
        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")
        val imageUrl = intent.getStringExtra("urlToImage")

        val titleTV= findViewById<TextView >(R.id.titleTextView)
        val descriptionTV = findViewById<TextView>(R.id.descriptionTextView)
        val imageView = findViewById<ImageView>(R.id.getImageView)

        titleTV.text = title
        descriptionTV.text = description
        Glide.with(this).load(imageUrl).into(imageView)
    }
}