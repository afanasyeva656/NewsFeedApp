package com.afanasyeva656.newsfeedapp.features.main_screen.data.api

import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("/top-headlines")
    suspend fun getTopHeadlines(
        @Query("apikey") apiKey: String = "66147346f2a941369d369f9f9eeff6d9",
        @Query("country") country: String = "ru",
        @Query("q") keyWords: String?
        ) : NewsModel
}