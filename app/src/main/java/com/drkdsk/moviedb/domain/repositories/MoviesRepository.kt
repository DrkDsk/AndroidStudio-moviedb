package com.drkdsk.moviedb.domain.repositories

import com.drkdsk.moviedb.domain.data.network.MoviesService

class MoviesRepository {
    private val api = MoviesService()

    suspend fun getMovies(type: String) {
        val response = api.getMovies(type)
        println(response)
        //MovieProvider.movieList = response

        return response
    }
}