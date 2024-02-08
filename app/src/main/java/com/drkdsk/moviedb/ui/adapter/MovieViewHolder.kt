package com.drkdsk.moviedb.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.drkdsk.moviedb.databinding.ItemMovieBinding
import com.drkdsk.moviedb.domain.data.model.MovieModel

class MovieViewHolder(view: View) : ViewHolder(view) {

    private val binding = ItemMovieBinding.bind(view)

    fun bind(movieModel : MovieModel, onClickListener: (MovieModel) -> Unit) {

        itemView.setOnClickListener {
            onClickListener(movieModel)
        }

        binding.textviewMovieName.text = movieModel.name
    }


}