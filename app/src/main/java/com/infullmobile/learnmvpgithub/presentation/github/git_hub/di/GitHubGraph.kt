package com.infullmobile.learnmvpgithub.presentation.github.git_hub.di

import android.support.annotation.VisibleForTesting

import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubActivity
import com.infullmobile.learnmvpgithub.presentation.application.di.ApplicationComponent
import com.infullmobile.learnmvpgithub.presentation.application.di.Components

import dagger.Component

class GitHubGraph(activity: GitHubActivity) {

    private val builder: DaggerGitHubGraph_GitHubComponent.Builder

    init {
        this.builder = DaggerGitHubGraph_GitHubComponent
                .builder()
                .applicationComponent(Components.from(activity.application))
                .gitHubModule(GitHubModule(activity))
    }

    fun inject(activity: GitHubActivity) {
        builder.build().inject(activity)
    }

    @VisibleForTesting
    fun setGitHubModule(module: GitHubModule) {
        builder.gitHubModule(module)
    }

    @GitHubScope
    @Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(GitHubModule::class))
    interface GitHubComponent {
        fun inject(activity: GitHubActivity)
    }
}
