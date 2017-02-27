package com.infullmobile.learnmvpgithub.presentation.application.di

import com.infullmobile.learnmvpgithub.domain.usecases.GetAllRepos
import com.infullmobile.learnmvpgithub.presentation.application.RepositoryModule
import com.infullmobile.learnmvpgithub.presentation.application.ServiceModule
import com.infullmobile.learnmvpgithub.presentation.application.UseCaseModule
import com.infullmobile.learnmvpgithub.services.GitHubService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        ServiceModule::class,
        UseCaseModule::class,
        RepositoryModule::class
))
interface ApplicationComponent {
    fun providesGetAllRepos(): GetAllRepos
    //    fun providesGetAllReposService(): GitHubService
}

