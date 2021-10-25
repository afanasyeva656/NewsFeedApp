package com.afanasyeva656.newsfeedapp.features.main_screen.data

import com.afanasyeva656.newsfeedapp.features.main_screen.data.api.model.ArticleModel
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

fun ArticleModel.toDomain() = ArticleDomainModel(
    author = this.author ?: "null",
    title = this.title,
    description = this.description ?: "null",
    url = this.url,
    urlToImage = this.urlToImage ?: "null",
    publishedAt = this.publishedAt
)
