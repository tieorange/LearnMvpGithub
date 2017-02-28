package com.infullmobile.learnmvpgithub.presentation.repo_detail

import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter

open class RepoDetailPresenter(private val model: RepoDetailModel,
                               view: RepoDetailView) : Presenter<RepoDetailView>(view) {

    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {

    }


}
