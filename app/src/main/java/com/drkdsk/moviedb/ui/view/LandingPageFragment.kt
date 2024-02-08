package com.drkdsk.moviedb.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.drkdsk.moviedb.databinding.FragmentLandingpageBinding

class LandingPageFragment : Fragment() {

    private var _binding: FragmentLandingpageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLandingpageBinding.inflate(inflater, container, false)

        binding.btnContinue.setOnClickListener {
            findNavController().navigate(
                LandingPageFragmentDirections.actionLandingPageFragmentToLoginFragment()
            )
        }

        return binding.root
    }
}