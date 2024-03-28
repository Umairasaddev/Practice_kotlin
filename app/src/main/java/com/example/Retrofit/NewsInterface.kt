package com.example.Retrofit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


//https://newsapi.org/v2/top-headlines?country=in&apiKey=05ce33b37cfc4557b85a5be7fe379d95

const val BASE_URL = "https://newsapi.org/"
const val API_KEY = "05ce33b37cfc4557b85a5be7fe379d95"

interface NewsInterface {

    @GET("v2/top-headlines?apiKey=${API_KEY}")
    fun getHeadlines(@Query("country") country: String, @Query("page") page: Int): Call<News>

}


//  Singelton class
object NewsService {

    val newsInstance: NewsInterface

    init {
        val retrofit =
            Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build()
        newsInstance = retrofit.create(NewsInterface::class.java)

    }
}














