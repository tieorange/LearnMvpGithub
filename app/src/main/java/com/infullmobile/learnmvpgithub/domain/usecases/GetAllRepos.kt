package com.infullmobile.learnmvpgithub.domain.usecases

import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import com.infullmobile.learnmvpgithub.repository.ReposRepository
import io.reactivex.Single

class GetAllRepos(private val reposRepository: ReposRepository) {
    fun doWork(): Single<List<Repo>> {
        return reposRepository.getAllRepos()
    }
}

