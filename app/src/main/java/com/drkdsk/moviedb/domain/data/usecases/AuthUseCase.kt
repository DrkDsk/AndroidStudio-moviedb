package com.drkdsk.moviedb.domain.data.usecases

import com.drkdsk.moviedb.domain.repositories.AuthRepository

class AuthUseCase {

    private val authRepository = AuthRepository()

    suspend fun login(email: String, password: String) = authRepository.login(email, password)
}