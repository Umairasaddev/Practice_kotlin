package com.example.DaggerMvvm.di

import com.example.DaggerMvvm.retrofit.FakerAPI
import com.example.DaggerMvvm.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.migration.DisableInstallInCheck
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@DisableInstallInCheck
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit {//    retrofit ka object bna k day ga

        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }


    @Singleton
    @Provides
    fun providesFakerApi(retrofit: Retrofit):FakerAPI{

        return retrofit.create(FakerAPI::class.java)
    }
}