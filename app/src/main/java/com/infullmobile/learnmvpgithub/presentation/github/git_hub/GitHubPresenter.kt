package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter

open class GitHubPresenter(private val model: GitHubModel,
                           view: GitHubView) : Presenter<GitHubView>(view) {
    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        model.getDummy(10)
    }


}
