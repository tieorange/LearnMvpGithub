package com.infullmobile.learnmvpgithub.presentation.repo_detail.di

import android.support.annotation.VisibleForTesting

import com.infullmobile.learnmvpgithub.presentation.repo_detail.RepoDetailActivity
import com.infullmobile.learnmvpgithub.presentation.application.di.ApplicationComponent
import com.infullmobile.learnmvpgithub.presentation.application.di.Components

import dagger.Component

class RepoDetailGraph(activity: RepoDetailActivity) {

    private val builder: DaggerRepoDetailGraph_RepoDetailComponent.Builder

    init {
        this.builder = DaggerRepoDetailGraph_RepoDetailComponent
                .builder()
                .applicationComponent(Components.from(activity.application))
                .repoDetailModule(RepoDetailModule(activity))
    }

    fun inject(activity: RepoDetailActivity) {
        builder.build().inject(activity)
    }

    @VisibleForTesting
    fun setRepoDetailModule(module: RepoDetailModule) {
        builder.repoDetailModule(module)
    }

    @RepoDetailScope
    @Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(RepoDetailModule::class))
    interface RepoDetailComponent {
        fun inject(activity: RepoDetailActivity)
    }
}
