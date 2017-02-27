package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.repository.ReposRepository
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import io.reactivex.Single
import java.util.*

open class GitHubModel(private val userLoadsRepoList: UserLoadsRepoList) {

    fun getDummy(count: Int): List<RepoEntity> {
        val list = (0..count).map { getDummyItem(it) }
        return list
    }
    fun loadRepoList(): Single<List<Repo>> = userLoadsRepoList.perform()

    fun getDummyItem(i: Int): RepoEntity {
        return RepoEntity("RepoEntity #$i")
    }

}

class UserLoadsRepoList(private val repo: ReposRepository): UseCase<List<Repo>>{
    fun doWork(): Single<List<Repo>> {
        return repo
    }

}
