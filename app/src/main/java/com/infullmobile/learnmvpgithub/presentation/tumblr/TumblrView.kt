package com.infullmobile.learnmvpgithub.presentation.tumblr

import android.support.annotation.LayoutRes
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R

open class TumblrView()
    : PresentedActivityView<TumblrPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_tumblr

    override fun onViewsBound() {

    }
}
