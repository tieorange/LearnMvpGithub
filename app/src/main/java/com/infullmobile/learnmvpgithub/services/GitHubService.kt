package com.infullmobile.learnmvpgithub.services

import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface GitHubService {
    @GET("/orgs/octokit/repos")
    fun  getAllRepos(): Single<List<RepoEntity>>

}

