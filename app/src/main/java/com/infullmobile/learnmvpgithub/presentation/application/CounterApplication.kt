package com.infullmobile.learnmvpgithub.presentation.application

import android.app.Application
import com.infullmobile.learnmvpgithub.presentation.application.di.ApplicationComponent
import com.infullmobile.learnmvpgithub.presentation.application.di.ApplicationGraph
import com.infullmobile.learnmvpgithub.presentation.application.di.DaggerApplicationComponent

class CounterApplication: Application() {

    internal lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = buildComponent()
    }
    private fun buildComponent(): ApplicationComponent {
        return ApplicationGraph(this).getComponent()
    }
}

