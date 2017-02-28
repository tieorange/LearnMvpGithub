package com.infullmobile.learnmvpgithub.presentation.repodetail

import android.support.annotation.LayoutRes
import android.widget.TextView
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R
import com.infullmobile.learnmvpgithub.domain.model.Repo

open class RepoDetailView()
    : PresentedActivityView<RepoDetailPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_repo_detail
    val name: TextView by bindView(R.id.repoDetailName)

    override fun onViewsBound() {

    }

    fun displayRepoData(repo: Repo) {
        name.text = repo.name
    }
}
