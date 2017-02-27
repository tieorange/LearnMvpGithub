package com.infullmobile.learnmvpgithub.presentation.application.di

import com.infullmobile.learnmvpgithub.domain.usecases.GetAllRepos
import com.infullmobile.learnmvpgithub.presentation.application.ServiceModule
import com.infullmobile.learnmvpgithub.presentation.application.UseCaseModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        ServiceModule::class,
        UseCaseModule::class
))
interface ApplicationComponent {
    fun providesGetAllRepos(): GetAllRepos
}

