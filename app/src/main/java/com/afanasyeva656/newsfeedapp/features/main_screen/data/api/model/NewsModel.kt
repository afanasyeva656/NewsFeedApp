package com.afanasyeva656.newsfeedapp.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsModel(@SerializedName("articles") val articles: Array<NewsMainModel>)