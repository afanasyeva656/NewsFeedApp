package com.afanasyeva656.newsfeedapp.features.main_screen.data.api

interface NewsRepository {
    suspend fun getNews(): String
}