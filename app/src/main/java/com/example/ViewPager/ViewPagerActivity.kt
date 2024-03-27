package com.example.ViewPager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.recyclerview.R

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)

        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val imageList = listOf(R.drawable.ai, R.drawable.hi, R.drawable.ai, R.drawable.hi)

        viewPager2.adapter = ViewPagerAdapter(imageList)
    }
}