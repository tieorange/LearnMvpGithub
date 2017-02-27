package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import com.infullmobile.learnmvpgithub.domain.model.Repo
import java.util.*

open class GitHubModel() {
    fun getDummy(count: Int): List<Repo> {
        val list = (0..count).map { getDummyItem(it) }
        return list
    }

    fun getDummyItem(i: Int): Repo {
        return Repo("Repo #$i")
    }

}
