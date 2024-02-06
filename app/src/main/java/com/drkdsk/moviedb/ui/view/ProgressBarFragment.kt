package com.drkdsk.moviedb.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.drkdsk.moviedb.databinding.FragmentProgressBarBinding
import com.drkdsk.moviedb.ui.viewModel.LandingPageViewModel

class ProgressBarFragment : Fragment() {

    private var _binding : FragmentProgressBarBinding? = null
    private val landingPageViewModel: LandingPageViewModel by viewModels()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProgressBarBinding.inflate(inflater, container, false)

        getIsFirstTimeInApp()

        return binding.root
    }

    private fun getIsFirstTimeInApp() {
        landingPageViewModel.onCreate()

        landingPageViewModel.isFirstTimeInApp.observe(viewLifecycleOwner) { firstTimeInApp ->
            when(firstTimeInApp) {
                true -> navigateToAuthFragment()
                false -> navigateToLandingPage()
            }
        }
    }

    private fun navigateToAuthFragment() {
        findNavController().navigate(
            ProgressBarFragmentDirections.actionProgressBarFragmentToAuthFragment()
        )
    }

    private fun navigateToLandingPage() {
        findNavController().navigate(
            ProgressBarFragmentDirections.actionProgressBarFragmentToLandingPageFragment()
        )
    }
}