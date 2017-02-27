package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter
import com.infullmobile.learnmvpgithub.domain.model.Repo

open class GitHubPresenter(private val model: GitHubModel,
                           view: GitHubView) : Presenter<GitHubView>(view) {

    lateinit var reposList: List<Repo>

    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        reposList = model.getDummy(10)
    }


}
