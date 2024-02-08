package com.drkdsk.moviedb.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.drkdsk.moviedb.databinding.FragmentLoginBinding
import com.drkdsk.moviedb.ui.viewModel.LoginViewModel

class LoginFragment : Fragment() {

    private var _binding : FragmentLoginBinding? = null
    private val loginViewModel: LoginViewModel by viewModels()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.btnLogin.setOnClickListener {
            login()
        }

        return binding.root
    }

    private fun login() {
        val email = binding.inputEmail.text.toString()
        val password = binding.inputPassword.text.toString()

        loginViewModel.onLogin(email, password)
        navigateToWelcome()
    }

    private fun navigateToWelcome() {
        findNavController().navigate(
            LoginFragmentDirections.actionLoginFragmentToHomeFragment()
        )

    }
}