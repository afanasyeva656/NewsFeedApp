package com.afanasyeva656.newsfeedapp.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsMainModel(
    @SerializedName("author")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("publishedAt")
    val publicationTime: String?
)