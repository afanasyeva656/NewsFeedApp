package com.afanasyeva656.newsfeedapp.features.bookmarks_screen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.afanasyeva656.newsfeedapp.R
import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.ui.adapter.BookmarkItemDecoration
import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.ui.adapter.BookmarksAdapter
import com.afanasyeva656.newsfeedapp.features.main_screen.ui.UIEvent
import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.ui.ViewState
import com.afanasyeva656.newsfeedapp.features.main_screen.ui.adapter.ArticleItemDecoration
import com.afanasyeva656.newsfeedapp.features.main_screen.ui.adapter.ArticlesAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel


class BookmarksScreenFragment: Fragment(R.layout.fragment_bookmarks) {
    private val viewModel by viewModel<BookmarksViewModel>()
    private val adapter by lazy { BookmarksAdapter(listOf()) }

    companion object {
        fun newInstance() : BookmarksScreenFragment = BookmarksScreenFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvBookmarks)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.addItemDecoration(BookmarkItemDecoration())
        viewModel.viewState.observe(viewLifecycleOwner, Observer(::render))
    }

    private fun render(viewState: ViewState) {
        adapter.updateArticles(viewState.articleList)
    }
}