package com.infullmobile.learnmvpgithub.services

import com.infullmobile.learnmvpgithub.domain.model.Repo
import retrofit2.Call
import retrofit2.http.GET

interface GitHubService {
    @GET("/orgs/octokit/repos")
    fun  getAllRepos(): Call<List<Repo>>

}

