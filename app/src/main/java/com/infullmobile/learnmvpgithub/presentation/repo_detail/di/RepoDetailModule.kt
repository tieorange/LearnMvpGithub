package com.infullmobile.learnmvpgithub.presentation.repo_detail.di

import android.content.Context

import com.infullmobile.learnmvpgithub.presentation.repo_detail.RepoDetailActivity
import com.infullmobile.learnmvpgithub.presentation.repo_detail.RepoDetailModel
import com.infullmobile.learnmvpgithub.presentation.repo_detail.RepoDetailPresenter
import com.infullmobile.learnmvpgithub.presentation.repo_detail.RepoDetailView

import dagger.Module
import dagger.Provides

@Module
class RepoDetailModule(private val activity: RepoDetailActivity) {

    @RepoDetailScope
    @Provides
    internal fun providesContext(): Context {
        return activity
    }

    @RepoDetailScope
    @Provides
    internal fun providesRepoDetailView(): RepoDetailView {
        return RepoDetailView()
    }

    @RepoDetailScope
    @Provides
    fun providesRepoDetailModel(): RepoDetailModel {
        return RepoDetailModel()
    }

    @RepoDetailScope
    @Provides
    internal fun providesRepoDetailPresenter(model: RepoDetailModel,
                                             view: RepoDetailView): RepoDetailPresenter {
        return RepoDetailPresenter(model, view)
    }
}
