package com.drkdsk.moviedb.domain.data.usecases

import com.drkdsk.moviedb.domain.data.model.MovieModel
import com.drkdsk.moviedb.domain.repositories.MoviesRepository

class GetMoviesUseCase {

    private val repository = MoviesRepository()

    suspend fun getMovies(type: String) : List<MovieModel> = repository.getMovies(type)
}