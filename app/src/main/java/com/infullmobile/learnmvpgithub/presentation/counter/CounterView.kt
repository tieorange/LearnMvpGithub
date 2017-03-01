package com.infullmobile.learnmvpgithub.presentation.counter

import android.support.annotation.LayoutRes
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R

open class CounterView()
    : PresentedActivityView<CounterPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_counter
    private val counter: TextView by bindView(R.id.counterCounter)
    private val increase: Button by bindView(R.id.counterIncrease)
    private val decrease: Button by bindView(R.id.counterDecrease)

    override fun onViewsBound() {
        counter.setOnClickListener { presenter.incrementCounter() }
        counter.setOnLongClickListener {
            presenter.decrementCounter()
            false
        }

        increase.setOnClickListener { presenter.incrementCounter() }
        decrease.setOnClickListener { presenter.decrementCounter() }
    }


    fun displayCounter(value: Int) {
        counter.text = value.toString()
    }
}
