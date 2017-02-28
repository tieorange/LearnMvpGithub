package com.infullmobile.learnmvpgithub.presentation.repo_detail

import android.support.annotation.LayoutRes
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R

open class RepoDetailView()
    : PresentedActivityView<RepoDetailPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_repo_detail

    override fun onViewsBound() {

    }
}
