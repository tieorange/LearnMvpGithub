package com.infullmobile.learnmvpgithub.presentation.repo_detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.infullmobile.android.infullmvp.InFullMvpActivity
import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.presentation.repo_detail.di.RepoDetailGraph
import javax.inject.Inject

class RepoDetailActivity : InFullMvpActivity<RepoDetailPresenter, RepoDetailView>() {

    @Inject lateinit var repoDetailPresenter: RepoDetailPresenter
    @Inject lateinit var repoDetailView: RepoDetailView
    lateinit var repoDetailGraph: RepoDetailGraph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        repoDetailGraph = RepoDetailGraph(this)
    }

    override val presenter: RepoDetailPresenter get() = repoDetailPresenter
    override val presentedView: RepoDetailView get() = repoDetailView

    override fun injectIntoGraph() {
        repoDetailGraph.inject(this)

    }

    companion object {
        private val EXTRA_REPO = "EXTRA_REPO"

        fun getIntent(context: Context, repo: Repo): Intent {
            val intent = Intent(context, RepoDetailActivity::class.java)
            val bundle = Bundle()
            bundle.putSerializable(EXTRA_REPO, repo)
            intent.putExtras(bundle)
            return intent
        }
    }
}
