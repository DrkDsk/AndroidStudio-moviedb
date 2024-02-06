package com.drkdsk.moviedb.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.drkdsk.moviedb.databinding.FragmentProgressBarBinding

class ProgressBarFragment : Fragment() {

    private var _binding : FragmentProgressBarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProgressBarBinding.inflate(inflater, container, false)

        return binding.root
    }
}