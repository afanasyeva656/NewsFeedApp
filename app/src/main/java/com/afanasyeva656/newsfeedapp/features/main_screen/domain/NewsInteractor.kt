package com.afanasyeva656.newsfeedapp.features.main_screen.domain

import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.NewsRepository

class NewsInteractor(private val repository: NewsRepository) {
    suspend fun getNews(): String {
        return repository.getNews()
    }
}