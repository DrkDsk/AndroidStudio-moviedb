package com.drkdsk.moviedb.domain.data.network

import com.drkdsk.moviedb.BuildConfig
import com.drkdsk.moviedb.core.RetrofitHelper
import com.drkdsk.moviedb.domain.data.model.MovieModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getMovies(type: String) : List<MovieModel> {

        return withContext(Dispatchers.IO) {
            val call = retrofit.create(MovieApiClient::class.java).getMovies(BuildConfig.ExtraBaseUrlMovieDB + type)
            val movieBody = call.body()
            var movies : List<MovieModel>? = emptyList()

            if (call.isSuccessful) {
                movies = movieBody?.movies!!
            }

            movies ?: emptyList()
        }
    }
}