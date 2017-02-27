package com.infullmobile.learnmvpgithub.presentation.application.di

import com.infullmobile.learnmvpgithub.presentation.application.ServiceModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        ServiceModule::class
))
interface ApplicationComponent {

}

