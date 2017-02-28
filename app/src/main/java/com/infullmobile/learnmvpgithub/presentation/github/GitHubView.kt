package com.infullmobile.learnmvpgithub.presentation.github

import android.support.annotation.LayoutRes
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R
import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import condeandfurious.lungsshoe.presentation.recycler.OnItemClickListener

open class GitHubView(private val repoAdapter: RepoAdapter)
    : PresentedActivityView<GitHubPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_github
    val recycler: RecyclerView by bindView(R.id.gitHubRecycler)

    override fun onViewsBound() {
        initRecycler()
    }

    public fun initRecycler() {
        repoAdapter.onItemClickListener = object : OnItemClickListener<Repo> {
            override fun onItemClick(item: Repo) {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
            }
        }
        recycler.adapter = repoAdapter
    }

    fun displayRepoList(reposList: List<Repo>?) {
        if (reposList != null) {
            repoAdapter.setData(reposList.toTypedArray())
        }
    }

}


