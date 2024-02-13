package com.drkdsk.moviedb.ui.view.decoration

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MarginItemDecoration(
    private val spaceSizeTop: Int,
    private val spaceSizeBottom: Int,
    private val spaceSizeLeft: Int,
    private val spaceSizeRight: Int,
    private val spaceBetweenVertical: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect, view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        with(outRect) {
            val currentPosition = parent.getChildAdapterPosition(view)
            if (currentPosition == 0) {
                top = spaceSizeTop
            }

            bottom = if (currentPosition == state.itemCount-1) {
                spaceSizeBottom
            } else {
                spaceBetweenVertical
            }

            left = spaceSizeLeft
            right = spaceSizeRight
        }
    }
}