package com.afanasyeva656.newsfeedapp.features.main_screen.di

import com.afanasyeva656.newsfeedapp.features.main_screen.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainScreenModule = module {
    viewModel {
        MainScreenViewModel()
    }
}