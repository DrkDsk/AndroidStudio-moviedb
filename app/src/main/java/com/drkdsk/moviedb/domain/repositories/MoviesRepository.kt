package com.drkdsk.moviedb.domain.repositories

import com.drkdsk.moviedb.domain.data.model.MovieModel
import com.drkdsk.moviedb.domain.data.network.MoviesService
import com.drkdsk.moviedb.domain.data.provider.MovieProvider

class MoviesRepository {
    private val api = MoviesService()

    suspend fun getMovies(type: String) : List<MovieModel> {
        val response = api.getMovies(type)
        MovieProvider.movieList = response

        return response
    }
}