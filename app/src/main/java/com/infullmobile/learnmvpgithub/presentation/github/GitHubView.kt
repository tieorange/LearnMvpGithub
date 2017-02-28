package com.infullmobile.learnmvpgithub.presentation.github

import android.support.annotation.LayoutRes
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R
import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity

open class GitHubView(private val gitHubAdapter: GitHubAdapter)
    : PresentedActivityView<GitHubPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_github
    val recycler: RecyclerView by bindView(R.id.gitHubRecycler)

    override fun onViewsBound() {
        initRecycler()
    }

    public fun initRecycler() {
//        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = gitHubAdapter
    }

    fun displayRepoList(reposList: List<Repo>?) {
        if (reposList != null) {
            gitHubAdapter.setData(reposList)
        }
    }
}

