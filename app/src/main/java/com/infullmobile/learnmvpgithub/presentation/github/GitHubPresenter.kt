package com.infullmobile.learnmvpgithub.presentation.github

import android.app.Activity
import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.LaunchableIntent
import com.infullmobile.android.infullmvp.Presenter
import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.presentation.repodetail.RepoDetailActivity
import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler

open class GitHubPresenter(private val model: GitHubModel,
                           view: GitHubView,
                           private val navigator: Navigator) : Presenter<GitHubView>(view) {


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

    fun openDetailActivity(item: Repo) {
        navigator.openDetailsActivity(item)
    }
}

class ActivityNavigation(private val activity: Activity) : Navigator {
    override fun openDetailsActivity(item: Repo) {
        LaunchableIntent(
                activity,
                RepoDetailActivity.getIntent(activity, item)
        ).start()

    }

}

interface Navigator {
    fun openDetailsActivity(item: Repo)


}
