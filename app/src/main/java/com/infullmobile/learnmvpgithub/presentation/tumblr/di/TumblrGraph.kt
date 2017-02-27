package com.infullmobile.learnmvpgithub.presentation.tumblr.di

import android.support.annotation.VisibleForTesting

import com.infullmobile.learnmvpgithub.presentation.tumblr.TumblrActivity
import com.infullmobile.learnmvpgithub.presentation.application.di.ApplicationComponent
import com.infullmobile.learnmvpgithub.presentation.application.di.Components

import dagger.Component

class TumblrGraph(activity: TumblrActivity) {

    private val builder: DaggerTumblrGraph_TumblrComponent.Builder

    init {
        this.builder = DaggerTumblrGraph_TumblrComponent
                .builder()
                .applicationComponent(Components.from(activity.application))
                .tumblrModule(TumblrModule(activity))
    }

    fun inject(activity: TumblrActivity) {
        builder.build().inject(activity)
    }

    @VisibleForTesting
    fun setTumblrModule(module: TumblrModule) {
        builder.tumblrModule(module)
    }

    @TumblrScope
    @Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(TumblrModule::class))
    interface TumblrComponent {
        fun inject(activity: TumblrActivity)
    }
}
