package com.infullmobile.learnmvpgithub.presentation.common

import com.infullmobile.learnmvpgithub.domain.model.Repo

interface Navigator {
    fun openDetailsActivity(item: Repo)
}