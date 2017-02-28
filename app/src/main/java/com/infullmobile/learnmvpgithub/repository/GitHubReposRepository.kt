package com.infullmobile.learnmvpgithub.repository

import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import com.infullmobile.learnmvpgithub.services.GitHubService
import io.reactivex.Single

/**
 * Created by andrii.kovalchuk on 2/27/17.
 */

class GitHubReposRepository(private val gitHubService: GitHubService) : ReposRepository {
    override fun getAllRepos(): Single<List<Repo>> {
        val allRepos = gitHubService.getAllRepos()
        val map: Single<List<Repo>> = allRepos.map { it.convertToRepo() }
        return map
    }

}

private fun List<RepoEntity>.convertToRepo(): List<Repo> {
    return map(::Repo)
}
