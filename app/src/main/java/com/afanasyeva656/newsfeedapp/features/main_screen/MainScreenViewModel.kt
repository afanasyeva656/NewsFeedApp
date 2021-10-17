package com.afanasyeva656.newsfeedapp.features.main_screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.NewsInteractor
import kotlinx.coroutines.launch

class MainScreenViewModel(private val newsInteractor: NewsInteractor): ViewModel() {
    private val lifeData: MutableLiveData<String> = MutableLiveData("")

    fun requstNews() {
        viewModelScope.launch {
            lifeData.postValue(newsInteractor.getNews())
        }
    }
}