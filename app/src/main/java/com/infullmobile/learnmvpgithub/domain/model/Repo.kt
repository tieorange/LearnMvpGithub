package com.infullmobile.learnmvpgithub.domain.model

import com.infullmobile.learnmvpgithub.repository.model.RepoEntity
import java.io.Serializable

/**
 * Created by andrii.kovalchuk on 2/27/17.
 */
data class Repo(
        val name: String?,
        val description: String?,
        val url: String?) : Serializable {
    constructor(repo: RepoEntity) : this(repo.name, repo.description, repo.url)

}