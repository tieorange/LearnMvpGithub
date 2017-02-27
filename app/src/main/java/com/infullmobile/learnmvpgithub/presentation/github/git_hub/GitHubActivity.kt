package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.infullmobile.android.infullmvp.InFullMvpActivity
import com.infullmobile.learnmvpgithub.presentation.github.git_hub.di.GitHubGraph
import javax.inject.Inject

class GitHubActivity : InFullMvpActivity<GitHubPresenter, GitHubView>() {

    @Inject lateinit var gitHubPresenter: GitHubPresenter
    @Inject lateinit var gitHubView: GitHubView
    lateinit var gitHubGraph: GitHubGraph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gitHubGraph = GitHubGraph(this)
    }

    override val presenter: GitHubPresenter get() = gitHubPresenter
    override val presentedView: GitHubView get() = gitHubView

    override fun injectIntoGraph() {
        gitHubGraph.inject(this)
    }

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, GitHubActivity::class.java)
        }
    }
}
