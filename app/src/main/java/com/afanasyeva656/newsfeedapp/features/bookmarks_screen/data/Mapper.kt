package com.afanasyeva656.newsfeedapp.features.bookmarks_screen.data

import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.data.local.BookmarksEntity
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

fun ArticleDomainModel.toEntityModel() = BookmarksEntity(
    url = url,
    author = author,
    title = title,
    description = description,
    publishedAt = publishedAt
)

fun BookmarksEntity.toDomainModel() = ArticleDomainModel(
    url = url,
    author = author,
    title = title,
    description = description,
    publishedAt = publishedAt
)