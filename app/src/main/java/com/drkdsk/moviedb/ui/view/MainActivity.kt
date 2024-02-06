package com.drkdsk.moviedb.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.drkdsk.moviedb.databinding.ActivityMainBinding
import com.drkdsk.moviedb.ui.viewModel.LandingPageViewModel

class MainActivity : AppCompatActivity() {

    private val landingPageViewModel: LandingPageViewModel by viewModels()
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        landingPageViewModel.onCreate()

        landingPageViewModel.isLoading.observe(this) {
            binding.progress.isVisible = it
        }
    }
}