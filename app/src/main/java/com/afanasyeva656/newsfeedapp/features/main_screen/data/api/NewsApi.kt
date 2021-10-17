package com.afanasyeva656.newsfeedapp.features.main_screen.data.api

import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("/everything")
    suspend fun getNews(
        @Query("q") topic: String?,
        @Query("apikey") apiKey: String = "66147346f2a941369d369f9f9eeff6d9"
    ) : NewsModel
}