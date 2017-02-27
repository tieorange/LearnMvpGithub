package com.infullmobile.learnmvpgithub.domain.usecases

import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.repository.ReposRepository

class GetAllRepos(private val reposRepository: ReposRepository) {
    fun doWork(): List<Repo> {
        return reposRepository.getAllRepos()
    }
}

