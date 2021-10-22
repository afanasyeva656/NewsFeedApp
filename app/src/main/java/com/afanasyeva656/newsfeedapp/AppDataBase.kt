package com.afanasyeva656.newsfeedapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.data.local.BookmarkDAO
import com.afanasyeva656.newsfeedapp.features.bookmarks_screen.data.local.BookmarksEntity

@Database(entities = [BookmarksEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun bookmarksDAO() : BookmarkDAO
}