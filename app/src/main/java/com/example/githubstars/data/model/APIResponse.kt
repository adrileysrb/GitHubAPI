package com.example.githubstars.data.model


import com.google.gson.annotations.SerializedName

data class APIResponse(
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("total_count")
    val totalCount: Int
)