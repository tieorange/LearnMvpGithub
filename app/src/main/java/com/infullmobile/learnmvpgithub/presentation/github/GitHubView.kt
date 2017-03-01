package com.infullmobile.learnmvpgithub.presentation.github

import android.app.Activity
import android.app.LauncherActivity
import android.support.annotation.LayoutRes
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import com.infullmobile.android.infullmvp.InFullMvpActivity
import com.infullmobile.android.infullmvp.LaunchableIntent
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R
import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.presentation.common.LaunchableIntentExtended
import com.infullmobile.learnmvpgithub.presentation.repodetail.RepoDetailActivity
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import condeandfurious.lungsshoe.presentation.recycler.OnItemClickListener

open class GitHubView(private val repoAdapter: RepoAdapter)
    : PresentedActivityView<GitHubPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_github
    private val recycler: RecyclerView by bindView(R.id.gitHubRecycler)

    override fun onViewsBound() {
        initRecycler()
    }

    fun initRecycler() {
        repoAdapter.onItemClickListener = object : OnItemClickListener<Repo> {
            override fun onItemClick(item: Repo) = presenter.openDetailActivity(item)
        }
        recycler.adapter = repoAdapter
    }

    fun displayRepoList(reposList: List<Repo>?) {
        if (reposList != null) {
            repoAdapter.setData(reposList.toTypedArray())
        }
    }

}


