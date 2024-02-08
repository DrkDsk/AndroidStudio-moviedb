package com.drkdsk.moviedb.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.drkdsk.moviedb.domain.data.model.MovieModel
import com.drkdsk.moviedb.domain.data.usecases.GetMoviesUseCase
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    val moviesModel = MutableLiveData<List<MovieModel>>()

    private var getMoviesUseCase = GetMoviesUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getMoviesUseCase.getMovies("popular")
            moviesModel.postValue(result)
        }
    }

}