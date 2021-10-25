package com.afanasyeva656.newsfeedapp.features.main_screen.ui.adapter

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ArticleItemDecoration: RecyclerView.ItemDecoration() {

    companion object {
        const val MARGIN_LEFT = 0
        const val MARGIN_TOP = 2
        const val MARGIN_RIGHT = 0
        const val MARGIN_BOTTOM = 2
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.set(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM)
    }
}