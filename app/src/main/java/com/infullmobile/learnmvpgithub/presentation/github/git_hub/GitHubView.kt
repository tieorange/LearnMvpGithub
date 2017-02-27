package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import android.support.annotation.LayoutRes
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R

open class GitHubView()
    : PresentedActivityView<GitHubPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_github
    val recycler: RecyclerView by bindView(R.id.gitHubRecycler)

    override fun onViewsBound() {
        initRecycler()
    }

    private fun initRecycler() {
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = GitHubAdapter()
    }
}

