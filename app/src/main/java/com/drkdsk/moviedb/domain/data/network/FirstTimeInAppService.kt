package com.drkdsk.moviedb.domain.data.network

import com.drkdsk.moviedb.BuildConfig
import com.drkdsk.moviedb.core.FirebaseHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class FirstTimeInAppService {
    private val firestore = FirebaseHelper.getFirestore()

    suspend fun getIsFirstTimeInApp() : Boolean {
        return withContext(Dispatchers.IO) {
            val response = firestore.collection(BuildConfig.StringCollectionDeviceTokens).document("TC4XqNORkc1MHtoAg1XN")
                .get().await()

            response.data == null
        }
    }


}