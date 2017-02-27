package com.infullmobile.learnmvpgithub.domain.usecases

import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import com.infullmobile.learnmvpgithub.repository.ReposRepository

class GetAllRepos(private val reposRepository: ReposRepository) {
    fun doWork(): List<RepoEntity> {
        return reposRepository.getAllRepos()
    }
}

