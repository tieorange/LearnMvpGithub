package com.infullmobile.learnmvpgithub.repository

import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import dagger.Provides
import io.reactivex.Single

interface ReposRepository {
    fun getAllRepos(): Single<List<Repo>>
}