package com.drkdsk.moviedb.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.drkdsk.moviedb.domain.data.usecases.AuthUseCase
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {

    private var authUseCase = AuthUseCase()

    fun onLogin(email : String, password: String) {
        viewModelScope.launch {
            authUseCase.login(email, password)
        }
    }
}