package com.example.Retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitMainActivity : AppCompatActivity() {
    lateinit var adapter: NewsAdapter
    lateinit var newsList: RecyclerView

    var pageNum = 1
    var totalResults = -1

    companion object {
        const val TAG: String = "retrofit"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_main)
        newsList = findViewById(R.id.newsListRv)
        getNews()
    }

    private fun getNews() {
        val news = NewsService.newsInstance.getHeadlines("in", pageNum)

        news.enqueue(object : Callback<News> {
            override fun onResponse(call: Call<News>, response: Response<News>) {

                val news = response.body()
                if (news != null) {
                    Log.d(TAG, "onResponse: " + news.toString())

                    totalResults = news.totalResults
                    Log.d(TAG, "onResponse: " + totalResults.toString())
                    adapter = NewsAdapter(this@RetrofitMainActivity, news.articles)
                    newsList.adapter = adapter
                    newsList.layoutManager = LinearLayoutManager(this@RetrofitMainActivity)
                }
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.d(TAG, "Error in fetching news: ")
            }
        })
    }
}
















