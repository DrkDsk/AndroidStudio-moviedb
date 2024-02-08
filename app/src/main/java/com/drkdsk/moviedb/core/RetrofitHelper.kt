package com.drkdsk.moviedb.core

import com.drkdsk.moviedb.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BaseUrlMovieDB)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}