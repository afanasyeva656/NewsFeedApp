package com.afanasyeva656.newsfeedapp.features.main_screen.ui

import com.afanasyeva656.newsfeedapp.base.BaseViewModel
import com.afanasyeva656.newsfeedapp.base.Event
import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.domain.BookmarkInteractor
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.NewsInteractor

class MainScreenViewModel(
    private val newsInteractor: NewsInteractor,
    private val bookmarkInteractor: BookmarkInteractor
) : BaseViewModel<ViewState>() {
    init {
        processDataEvent(DataEvent.OnLoadData)
    }

    override fun initialViewState(): ViewState {
        return ViewState(emptyList(), null, true, false, "")
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UIEvent.OnSaveArticleClicked -> {
                bookmarkInteractor.create(event.articleDomainModel)
            }
            is DataEvent.OnLoadData -> {
                newsInteractor.getNews().fold(
                    onSuccess = { processDataEvent(DataEvent.SuccessNewsRequest(it)) },
                    onError = {
                        processDataEvent(
                            DataEvent.ErrorNewsRequest(
                                it.localizedMessage ?: ""
                            )
                        )
                    }
                )
            }
            is DataEvent.SuccessNewsRequest -> {
                return previousState.copy(articleList = event.articleList, isLoading = false)
            }
            is DataEvent.ErrorNewsRequest -> {
            }
        }
        return null
    }
}