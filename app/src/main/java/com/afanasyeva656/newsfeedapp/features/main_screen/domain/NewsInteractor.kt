package com.afanasyeva656.newsfeedapp.features.main_screen.domain

import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.NewsRepository
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

class NewsInteractor(private val repository: NewsRepository) {
    suspend fun getNews(): List<ArticleDomainModel> {
        return repository.getNews()
    }
}