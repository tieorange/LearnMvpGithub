package com.infullmobile.learnmvpgithub.presentation.repodetail

import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter
import com.infullmobile.learnmvpgithub.domain.model.Repo

open class RepoDetailPresenter(private val model: RepoDetailModel,
                               view: RepoDetailView) : Presenter<RepoDetailView>(view) {
    private lateinit var repo: Repo

    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        extractExtras(intentBundle)
        presentedView.displayRepoData(repo)
    }


    // TODO: extract to class
    private fun extractExtras(intentBundle: Bundle) {
        repo = intentBundle.getSerializable(RepoDetailActivity.EXTRA_REPO) as Repo
    }


}
