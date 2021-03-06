package com.afanasyeva656.newsfeedapp.features.main_screen.ui

import com.afanasyeva656.newsfeedapp.base.Event
import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.model.ArticleModel
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

/* С помощью контракта мы заранее должны спроектировать все действия
пользователя относительно нашего экрана (UIEvent), а также все действия,
которые будут происходить без пользователя (DataEvent) */

data class ViewState(
    val articleList: List<ArticleDomainModel>,
    val errorMessage: String?,
    val isLoading: Boolean,
    val isSearchVisible: Boolean,
    val searchText: String
    )

sealed class UIEvent() : Event {
    data class OnSaveArticleClicked(val articleDomainModel: ArticleDomainModel): UIEvent()
    data class OnArticleClicked(val articleDomainModel: ArticleDomainModel): UIEvent()
    object OnSearchClick: UIEvent()
}

sealed class DataEvent() : Event {
    // Симв. о том, что происходит (команда)
    object OnLoadData: DataEvent()
    data class SuccessNewsRequest(val articleList: List<ArticleDomainModel>) : DataEvent()
    data class ErrorNewsRequest(val error: String) : DataEvent()
}