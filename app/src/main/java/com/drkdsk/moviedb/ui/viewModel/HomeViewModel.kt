package com.drkdsk.moviedb.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.drkdsk.moviedb.domain.data.usecases.GetMoviesUseCase
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private var getMoviesUseCase = GetMoviesUseCase()

    fun onCreate() {
        viewModelScope.launch {
            getMoviesUseCase.getMovies("popular")
        }
    }

}