package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<FoodDataClass>

    private lateinit var imageList: Array<Int>
    private lateinit var titleList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.hi,
            R.drawable.ai,
            R.drawable.hi,
            R.drawable.ai,
            R.drawable.hi,
            R.drawable.ai,
            R.drawable.hi
        )

        titleList = arrayOf(
            "List",
            "Artificial Intelligence",
            "Array List",
            "List",
            "Artificial Intelligence",
            "Array List",
            "List"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        foodList = ArrayList()
        getData()
    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = FoodDataClass(imageList[i], titleList[i])
            foodList.add(dataClass)
        }
        recyclerView.adapter = FoodAdapter(foodList)
    }
}
