package com.infullmobile.learnmvpgithub.presentation.repodetail.di

import android.content.Context

import com.infullmobile.learnmvpgithub.presentation.repodetail.RepoDetailActivity
import com.infullmobile.learnmvpgithub.presentation.repodetail.RepoDetailModel
import com.infullmobile.learnmvpgithub.presentation.repodetail.RepoDetailPresenter
import com.infullmobile.learnmvpgithub.presentation.repodetail.RepoDetailView

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
