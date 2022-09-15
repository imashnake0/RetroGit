package com.imashnake0.retrogit.data.apis

import com.imashnake0.retrogit.data.models.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubApi {
    @GET("users/{user}/repos")
    suspend fun fetchRepos(@Path("user") user: String): List<Repo>
}
