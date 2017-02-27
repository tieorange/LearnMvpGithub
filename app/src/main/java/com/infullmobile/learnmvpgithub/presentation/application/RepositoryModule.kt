package com.infullmobile.learnmvpgithub.presentation.application

import com.infullmobile.learnmvpgithub.repository.GitHubReposRepository
import com.infullmobile.learnmvpgithub.repository.ReposRepository
import com.infullmobile.learnmvpgithub.services.GitHubService
import dagger.Module
import dagger.Provides

/**
 * Created by andrii.kovalchuk on 2/27/17.
 */
@Module
class RepositoryModule {

    @Provides
    fun providesReposRepository(gitHubService: GitHubService): ReposRepository {
        return GitHubReposRepository(gitHubService)
    }
}