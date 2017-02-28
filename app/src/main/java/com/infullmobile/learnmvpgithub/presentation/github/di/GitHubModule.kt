package com.infullmobile.learnmvpgithub.presentation.github.di

import android.content.Context
import com.infullmobile.learnmvpgithub.presentation.application.RepositoryModule
import com.infullmobile.learnmvpgithub.presentation.application.ServiceModule
import com.infullmobile.learnmvpgithub.presentation.github.*

import com.infullmobile.learnmvpgithub.repository.ReposRepository

import dagger.Module
import dagger.Provides

@Module(includes = arrayOf(RepositoryModule::class, ServiceModule::class))
class GitHubModule(private val activity: GitHubActivity) {

    @GitHubScope
    @Provides
    internal fun providesContext(): Context {
        return activity
    }

    @GitHubScope
    @Provides
    fun providesGitHubModel(repository: ReposRepository): GitHubModel {
        return GitHubModel(repository)
    }

    @GitHubScope
    @Provides
    internal fun providesGitHubView(adapter: GitHubAdapter): GitHubView {
        return GitHubView(adapter)
    }

    @GitHubScope
    @Provides
    internal fun providesGitHubPresenter(model: GitHubModel,
                                         view: GitHubView): GitHubPresenter {
        return GitHubPresenter(model, view)
    }

    @GitHubScope
    @Provides
    internal fun providesGitHubAdapter(): GitHubAdapter {
        return GitHubAdapter()
    }
}
