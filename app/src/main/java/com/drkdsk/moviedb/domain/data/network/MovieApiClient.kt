package com.drkdsk.moviedb.domain.data.network

import com.drkdsk.moviedb.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MovieApiClient {

    @Headers("accept: application/json", "Authorization: Bearer ${BuildConfig.ApikeyMoviedb}")
    @GET("/3/movie/popular")
    suspend fun getMovies(
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1
    ) : Response<Map<Any, Any>>

}