package com.afanasyeva656.newsfeedapp.features.bookmarks_screen.domain

import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.data.BookmarksRepo
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

class BookmarkInteractor(private val repo: BookmarksRepo) {
    suspend fun create(articleDomainModel: ArticleDomainModel) = repo.create(articleDomainModel)
    suspend fun read() : List<ArticleDomainModel> = repo.read()
    suspend fun update(articleDomainModel: ArticleDomainModel) = repo.update(articleDomainModel)
    suspend fun delete(articleDomainModel: ArticleDomainModel) = repo.delete(articleDomainModel)
}