package com.infullmobile.learnmvpgithub.presentation.github

import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler

open class GitHubPresenter(private val model: GitHubModel,
                           view: GitHubView) : Presenter<GitHubView>(view) {


    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        model.loadRepoList()
                .subscribeOn(IoScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                               reposList ->
                               presentedView.displayRepoList(reposList)
                           }, {
                               // error
                           })
    }


}
