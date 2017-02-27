package com.infullmobile.learnmvpgithub.repository

import com.infullmobile.learnmvpgithub.domain.model.Repo
import dagger.Provides

interface ReposRepository {
    fun getAllRepos(): List<Repo>
}