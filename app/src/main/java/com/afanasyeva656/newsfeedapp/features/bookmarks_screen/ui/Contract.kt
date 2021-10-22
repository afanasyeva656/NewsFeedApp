package com.afanasyeva656.newsfeedapp.features.bookmarks_screen.ui

import com.afanasyeva656.newsfeedapp.base.Event
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

data class ViewState(
    val articleList: List<ArticleDomainModel>
)

sealed class DataEvent: Event {
    object RefreshDataBase: DataEvent()
}