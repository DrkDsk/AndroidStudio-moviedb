package com.drkdsk.moviedb.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.drkdsk.moviedb.R
import com.drkdsk.moviedb.domain.data.model.MovieModel

class MovieAdapter(private val movieList: List<MovieModel>, private val onClickListener : (MovieModel) -> Unit) : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(layoutInflater.inflate(R.layout.item_movie, parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.bind(movie, onClickListener)
    }

    override fun getItemCount(): Int = movieList.size


}