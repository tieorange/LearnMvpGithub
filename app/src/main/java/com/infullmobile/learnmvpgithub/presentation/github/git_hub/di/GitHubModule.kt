package com.infullmobile.learnmvpgithub.presentation.github.git_hub.di

import android.content.Context

import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubActivity
import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubModel
import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubPresenter
import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubView

import dagger.Module
import dagger.Provides

@Module
class GitHubModule(private val activity: GitHubActivity) {

    @GitHubScope
    @Provides
    internal fun providesContext(): Context {
        return activity
    }

    @GitHubScope
    @Provides
    internal fun providesGitHubView(): GitHubView {
        return GitHubView()
    }

    @GitHubScope
    @Provides
    fun providesGitHubModel(): GitHubModel {
        return GitHubModel()
    }

    @GitHubScope
    @Provides
    internal fun providesGitHubPresenter(model: GitHubModel,
                                         view: GitHubView): GitHubPresenter {
        return GitHubPresenter(model, view)
    }
}
