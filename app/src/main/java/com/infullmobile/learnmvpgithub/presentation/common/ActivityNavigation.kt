package com.infullmobile.learnmvpgithub.presentation.common

import android.app.Activity
import com.infullmobile.android.infullmvp.LaunchableIntent
import com.infullmobile.learnmvpgithub.domain.model.Repo
import com.infullmobile.learnmvpgithub.presentation.repodetail.RepoDetailActivity

class ActivityNavigation(private val activity: Activity) : Navigator {
    override fun openDetailsActivity(item: Repo) {
        LaunchableIntent(
                activity,
                RepoDetailActivity.getIntent(activity,
                                             item)
        ).start()

    }

}

