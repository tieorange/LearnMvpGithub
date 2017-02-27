package com.infullmobile.learnmvpgithub.presentation.tumblr

import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter

open class TumblrPresenter(private val model: TumblrModel,
                           view: TumblrView) : Presenter<TumblrView>(view) {
    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {

    }


}
