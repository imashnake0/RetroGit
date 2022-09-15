package com.imashnake0.retrogit.data.models

data class Repo(
    val id: Int,
    val name: String,
    val url: String,
    val description: String,
    val topics: List<String>,
    val stargazers_count: String
)
