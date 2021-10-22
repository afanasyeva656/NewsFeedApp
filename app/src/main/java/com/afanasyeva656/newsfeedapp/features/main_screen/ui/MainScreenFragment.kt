package com.afanasyeva656.newsfeedapp.features.main_screen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.afanasyeva656.newsfeedapp.R
import com.afanasyeva656.newsfeedapp.features.main_screen.ui.adapter.ArticlesAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainScreenFragment: Fragment() {
    private val viewModel by viewModel<MainScreenViewModel>()
    private val adapter by lazy { ArticlesAdapter(listOf())}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvActicles)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        viewModel.viewState.observe(viewLifecycleOwner, Observer(::render))

    }

    private fun render(viewState: ViewState) {
        adapter.updateArticles(viewState.articleList)
    }
}