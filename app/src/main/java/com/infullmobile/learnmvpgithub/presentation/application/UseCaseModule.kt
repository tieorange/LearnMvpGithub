package com.infullmobile.learnmvpgithub.presentation.application

import com.infullmobile.learnmvpgithub.domain.usecases.GetAllRepos
import com.infullmobile.learnmvpgithub.repository.ReposRepository
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun providesGetAllRepos(reposRepository: ReposRepository): GetAllRepos {
        return GetAllRepos(reposRepository)
    }
}