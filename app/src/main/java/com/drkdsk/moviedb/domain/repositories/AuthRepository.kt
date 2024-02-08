package com.drkdsk.moviedb.domain.repositories

import com.drkdsk.moviedb.domain.data.network.AuthService

class AuthRepository {

    private val api = AuthService()

    suspend fun login(email : String, password: String) {
        //val response = api.login(email, password)
    }
}