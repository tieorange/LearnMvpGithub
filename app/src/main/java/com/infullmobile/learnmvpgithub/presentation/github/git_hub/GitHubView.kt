package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import android.support.annotation.LayoutRes
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.presentation.R

open class GitHubView()
    : PresentedActivityView<GitHubPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_github

    override fun onViewsBound() {

    }
}
