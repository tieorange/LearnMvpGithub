package com.infullmobile.learnmvpgithub.repository

import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.services.GitHubService

/**
 * Created by andrii.kovalchuk on 2/27/17.
 */

class GitHubReposRepository(private val gitHubService: GitHubService) : ReposRepository {
    override fun getAllRepos(): List<Repo> {
        return gitHubService.getAllRepos().body()
    }

}