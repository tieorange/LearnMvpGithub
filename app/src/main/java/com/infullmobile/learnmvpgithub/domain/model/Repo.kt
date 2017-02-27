package com.infullmobile.learnmvpgithub.domain.model

import com.infullmobile.learnmvpgithub.repository.model.RepoEntity

/**
 * Created by andrii.kovalchuk on 2/27/17.
 */
data class Repo(val name: String) {
    constructor(repo: RepoEntity) : this(
            repo.name
    )


}