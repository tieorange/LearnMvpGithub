package com.infullmobile.learnmvpgithub.presentation.tumblr

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.infullmobile.android.infullmvp.InFullMvpActivity
import com.infullmobile.learnmvpgithub.presentation.tumblr.di.TumblrGraph
import javax.inject.Inject

class TumblrActivity : InFullMvpActivity<TumblrPresenter, TumblrView>() {

    @Inject lateinit var tumblrPresenter: TumblrPresenter
    @Inject lateinit var tumblrView: TumblrView
    lateinit var tumblrGraph: TumblrGraph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tumblrGraph = TumblrGraph(this)
    }

    override val presenter: TumblrPresenter get() = tumblrPresenter
    override val presentedView: TumblrView get() = tumblrView

    override fun injectIntoGraph() {
        tumblrGraph.inject(this)
    }

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, TumblrActivity::class.java)
        }
    }
}
