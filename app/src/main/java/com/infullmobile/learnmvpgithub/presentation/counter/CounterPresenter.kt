package com.infullmobile.learnmvpgithub.presentation.counter

import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter

open class CounterPresenter(private val model: CounterModel,
                            view: CounterView) : Presenter<CounterView>(view) {
    private var counter: Int = 1

    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        counter = model.counter
        presentedView.displayCounter(counter)
    }

    fun incrementCounter() {
        counter++
        presentedView.displayCounter(counter)
    }

    fun decrementCounter() {
        counter--
        presentedView.displayCounter(counter)
    }
}
