package com.afanasyeva656.newsfeedapp.features.main_screen.data.api

import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.model.NewsModel

class NewsRemoteSource(private val api: NewsApi) {
    suspend fun getNews(): NewsModel {
        return api.getTopHeadlines()
    }
}