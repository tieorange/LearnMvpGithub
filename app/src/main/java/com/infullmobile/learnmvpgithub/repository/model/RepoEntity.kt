package com.infullmobile.learnmvpgithub.repository.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class RepoEntity {
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("full_name")
    @Expose
    var fullName: String? = null
    @SerializedName("private")
    @Expose
    var _private: Boolean? = null
    @SerializedName("html_url")
    @Expose
    var htmlUrl: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("fork")
    @Expose
    var fork: Boolean? = null
    @SerializedName("url")
    @Expose
    var url: String? = null
}