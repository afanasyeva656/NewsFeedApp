package com.afanasyeva656.newsfeedapp.features.main_screen.data.api

import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.NewsRepository

class NewsRepositoryImpl(private val source: NewsRemoteSource): NewsRepository {
    override suspend fun getNews(): String {
        return source.getNews().articles[0].title
    }
}
