package com.afanasyeva656.newsfeedapp.features.main_screen.ui

import com.afanasyeva656.newsfeedapp.base.BaseViewModel
import com.afanasyeva656.newsfeedapp.base.Event
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.NewsInteractor

class NewsFeedScreenViewModel(
    private val newsInteractor: NewsInteractor
) : BaseViewModel<ViewState>() {
    override fun initialViewState(): ViewState {
        return ViewState(emptyList(), "")
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UIEvent.GetCurrentNews -> {
                newsInteractor.getNews().fold(
                    onError = {
                        processDataEvent(
                            DataEvent.ErrorNewsRequest(
                                it.localizedMessage ?: ""
                            )
                        )
                    },
                    onSuccess = { processDataEvent(DataEvent.SuccessNewsRequest(it)) }
                )
            }
            is DataEvent.OnLoadData -> {
            }
            is DataEvent.SuccessNewsRequest -> {

            }
            is DataEvent.ErrorNewsRequest -> {
            }
        }

        return null
    }


}