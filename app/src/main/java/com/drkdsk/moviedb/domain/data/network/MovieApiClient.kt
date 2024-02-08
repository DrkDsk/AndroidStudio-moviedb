package com.drkdsk.moviedb.domain.data.network

import com.drkdsk.moviedb.BuildConfig
import com.drkdsk.moviedb.domain.data.model.ListMovieModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import retrofit2.http.Url

interface MovieApiClient {

    @Headers("accept: application/json", "Authorization: Bearer ${BuildConfig.ApikeyMoviedb}")
    @GET
    suspend fun getMovies(
        @Url type: String,
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1
    ) : Response<ListMovieModel>

}