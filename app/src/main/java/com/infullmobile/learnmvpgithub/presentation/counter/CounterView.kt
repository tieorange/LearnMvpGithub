package com.infullmobile.learnmvpgithub.presentation.counter

import android.support.annotation.LayoutRes
import android.view.View
import android.widget.TextView
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R

open class CounterView()
    : PresentedActivityView<CounterPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_counter
    private val counter: TextView by bindView(R.id.counterCounter)

    override fun onViewsBound() {
        counter.setOnClickListener { presenter.incrementCounter() }
        counter.setOnLongClickListener {
            presenter.decrementCounter()
            false
        }
    }


    fun displayCounter(value: Int) {
        counter.text = value.toString()
    }
}
