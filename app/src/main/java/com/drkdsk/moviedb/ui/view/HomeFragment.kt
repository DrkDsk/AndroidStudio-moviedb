package com.drkdsk.moviedb.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.drkdsk.moviedb.R
import com.drkdsk.moviedb.databinding.FragmentHomeBinding
import com.drkdsk.moviedb.domain.data.model.MovieModel
import com.drkdsk.moviedb.domain.data.provider.MovieProvider
import com.drkdsk.moviedb.ui.adapter.MovieAdapter
import com.drkdsk.moviedb.ui.viewModel.HomeViewModel

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initRecyclerView()

        binding.toolbar.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.menu, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {

                return when(menuItem.itemId) {
                    R.id.favorites -> {
                        true
                    }

                    else -> false
                }

            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)
    }

    private fun initRecyclerView() {
        homeViewModel.onCreate()

        homeViewModel.moviesModel.observe(viewLifecycleOwner) {
            binding.recyclerViewMovie.layoutManager =  LinearLayoutManager(binding.root.context)
            binding.recyclerViewMovie.adapter = MovieAdapter(MovieProvider.movieList) { movie ->
                onItemSelected(movie)
            }
        }
    }

    private fun onItemSelected(movie: MovieModel) {
        Toast.makeText(binding.root.context, movie.title, Toast.LENGTH_LONG).show()
    }
}