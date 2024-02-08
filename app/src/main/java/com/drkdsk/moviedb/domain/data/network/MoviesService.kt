package com.drkdsk.moviedb.domain.data.network

import com.drkdsk.moviedb.core.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getMovies(type: String) {

        return withContext(Dispatchers.IO) {
            val response = retrofit.create(MovieApiClient::class.java).getMovies()

            response.body()?.get("results")
        }
    }
}