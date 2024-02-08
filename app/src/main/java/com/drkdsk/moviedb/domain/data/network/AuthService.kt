package com.drkdsk.moviedb.domain.data.network

import com.drkdsk.moviedb.core.FirebaseHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class AuthService {

    private val auth = FirebaseHelper.getAuthFirebase()

    suspend fun login(email: String, password: String) {
        return withContext(Dispatchers.IO) {
            val response = auth.signInWithEmailAndPassword(email, password).await()

            response.user
        }
    }

}