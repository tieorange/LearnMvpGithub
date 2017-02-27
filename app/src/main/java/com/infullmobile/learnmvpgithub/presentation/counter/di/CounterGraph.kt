package com.infullmobile.learnmvpgithub.presentation.counter.di

import android.support.annotation.VisibleForTesting

import com.infullmobile.learnmvpgithub.presentation.application.di.ApplicationComponent
import com.infullmobile.learnmvpgithub.presentation.application.di.Components
import com.infullmobile.learnmvpgithub.presentation.counter.CounterActivity

import dagger.Component

class CounterGraph(activity: CounterActivity) {
    private val builder: DaggerCounterGraph_CounterComponent.Builder

    init {

        this.builder = DaggerCounterGraph_CounterComponent
                .builder()
                .applicationComponent(Components.from(activity.application))
                .counterModule(CounterModule(activity))
    }

    fun inject(activity: CounterActivity) {
        builder.build().inject(activity)
    }

    @VisibleForTesting
    fun setCounterModule(module: CounterModule) {
        builder.counterModule(module)
    }

    @CounterScope
    @Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(CounterModule::class))
    interface CounterComponent {
        fun inject(activity: CounterActivity)
    }
}
