package com.drkdsk.moviedb.domain.data.usecases

import com.drkdsk.moviedb.domain.repositories.FirstTimeAppRepository

class GetFirstTimeInAppUseCase {

    private val repository = FirstTimeAppRepository()

    suspend operator fun invoke() : Boolean = repository.getIsFirstTime()
}