package com.drkdsk.moviedb.domain.repositories

import com.drkdsk.moviedb.domain.data.model.FirsTimeInAppProvider
import com.drkdsk.moviedb.domain.data.network.FirstTimeInAppService

class FirstTimeAppRepository {

    private val api = FirstTimeInAppService()

    suspend fun getIsFirstTime() : Boolean {
        val response : Boolean = api.getIsFirstTimeInApp()
        FirsTimeInAppProvider.firstTimeInApp = response

        return response
    }


}