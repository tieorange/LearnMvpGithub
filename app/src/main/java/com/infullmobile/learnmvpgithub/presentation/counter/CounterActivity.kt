package com.infullmobile.learnmvpgithub.presentation.counter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.infullmobile.android.infullmvp.InFullMvpActivity
import com.infullmobile.learnmvpgithub.presentation.counter.di.CounterGraph
import javax.inject.Inject

class CounterActivity : InFullMvpActivity<CounterPresenter, CounterView>() {

    @Inject lateinit var counterPresenter: CounterPresenter
    @Inject lateinit var counterView: CounterView
    lateinit var counterGraph: CounterGraph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        counterGraph = CounterGraph(this)
    }

    override val presenter: CounterPresenter get() = counterPresenter
    override val presentedView: CounterView get() = counterView

    override fun injectIntoGraph() {
        counterGraph.inject(this)
    }

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, CounterActivity::class.java)
        }
    }
}
