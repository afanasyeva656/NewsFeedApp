package com.afanasyeva656.newsfeedapp.features.bookmarks_screen.data

import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.data.local.BookmarksEntity
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

interface BookmarksRepo {
    suspend fun create(articleDomainModel: ArticleDomainModel)
    suspend fun read() : List<ArticleDomainModel>
    suspend fun update(articleDomainModel: ArticleDomainModel)
    suspend fun delete(articleDomainModel: ArticleDomainModel)
}