package com.infullmobile.learnmvpgithub.presentation.application.di

import com.infullmobile.learnmvpgithub.presentation.application.CounterApplication
import com.infullmobile.learnmvpgithub.presentation.application.RepositoryModule
import com.infullmobile.learnmvpgithub.presentation.application.ServiceModule
import com.infullmobile.learnmvpgithub.presentation.application.UseCaseModule

class ApplicationGraph(application: CounterApplication) {
    private val componentBuilder: DaggerApplicationComponent.Builder

    init {
        componentBuilder = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(application))
                .repositoryModule(RepositoryModule())
                .serviceModule(ServiceModule())
                .useCaseModule(UseCaseModule())
    }

    fun getComponent(): ApplicationComponent {
        return componentBuilder.build()
    }

}