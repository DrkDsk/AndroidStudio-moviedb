package com.drkdsk.moviedb.domain.data.provider

import com.drkdsk.moviedb.domain.data.model.MovieModel

class MovieProvider {

    companion object {
        var movieList : List<MovieModel> = emptyList()
    }

}