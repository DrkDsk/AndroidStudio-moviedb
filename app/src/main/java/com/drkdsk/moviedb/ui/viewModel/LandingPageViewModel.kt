package com.drkdsk.moviedb.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.drkdsk.moviedb.domain.data.usecases.GetFirstTimeInAppUseCase
import kotlinx.coroutines.launch

class LandingPageViewModel: ViewModel() {
    val isFirstTimeInApp = MutableLiveData<Boolean>()
    var getIsFirstTimeInAppCase = GetFirstTimeInAppUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getIsFirstTimeInAppCase()

            isFirstTimeInApp.postValue(result)
        }
    }

}