package com.drkdsk.moviedb.domain.data.usecases

import com.drkdsk.moviedb.domain.repositories.MoviesRepository

class GetMoviesUseCase {

    private val repository = MoviesRepository()

    suspend fun getMovies(type: String) = repository.getMovies(type)
}