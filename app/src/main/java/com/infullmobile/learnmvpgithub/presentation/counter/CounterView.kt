package com.infullmobile.learnmvpgithub.presentation.counter

import android.support.annotation.LayoutRes
import android.widget.TextView
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.learnmvpgithub.R
import com.infullmobile.learnmvpgithub.presentation.counter.R

open class CounterView()
    : PresentedActivityView<CounterPresenter>() {

    @LayoutRes override val layoutResId = R.layout.activity_counter

    override fun onViewsBound() {

    }

    private val  counter: TextView by R.id.

    fun displayCounter(value: Int) {
        counter.text = value
    }
}
