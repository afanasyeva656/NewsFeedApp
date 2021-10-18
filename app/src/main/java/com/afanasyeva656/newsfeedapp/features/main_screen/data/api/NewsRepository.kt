package com.afanasyeva656.newsfeedapp.features.main_screen.data.api

import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

interface NewsRepository {
    suspend fun getNews(): List<ArticleDomainModel>
}