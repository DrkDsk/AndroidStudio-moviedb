package com.drkdsk.moviedb.domain.data.model

import com.google.gson.annotations.SerializedName

data class ListMovieModel(
    @SerializedName("page") var page: Int,
    @SerializedName("results") var movies: List<MovieModel>,
    @SerializedName("total_pages") var total_pages: Int,
    @SerializedName("total_results") var total_results: Int
)