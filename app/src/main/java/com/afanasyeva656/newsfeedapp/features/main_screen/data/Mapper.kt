package com.afanasyeva656.newsfeedapp.features.main_screen.data.api

import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.model.ArticleModel
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

fun ArticleModel.toDomain() = ArticleDomainModel(
    author = this.author,
    title = this.title,
    description = this.description,
    url = this.url,
    publishedAt = this.publishedAt
)