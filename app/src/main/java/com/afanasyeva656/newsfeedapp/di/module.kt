package com.afanasyeva656.newsfeedapp.di

import androidx.room.Room
import com.afanasyeva656.newsfeedapp.AppDataBase
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

//const val BASE_URL = "https://api.openweathermap.org/"
const val DATA_BASE = "DATA_BASE"
val appModule = module {
//    single<OkHttpClient> {
//        OkHttpClient.Builder()
//            .build()
//    }
}

val dataBaseModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDataBase::class.java, DATA_BASE)
            .fallbackToDestructiveMigration()
            .build()
    }

    single {
        get<AppDataBase>().bookmarksDAO()
    }
}