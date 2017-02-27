package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import com.infullmobile.learnmvpgithub.domain.model.Repo
import java.util.*

open class GitHubModel() {
    fun getDummy(count: Int): List<Repo> {
        val list = ArrayList<Repo>()
        for (i in 0..count) {
            list.add(getDummyItem(i))
        }
        return
    }

    fun getDummyItem(i: Int): Repo {
        return Repo("Repo #$i")
    }

}
