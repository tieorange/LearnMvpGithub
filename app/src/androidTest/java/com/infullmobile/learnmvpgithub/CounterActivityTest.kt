package com.infullmobile.learnmvpgithub

import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.assertion.ViewAssertions.*
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.infullmobile.learnmvpgithub.presentation.counter.CounterActivity
import com.infullmobile.learnmvpgithub.presentation.github.GitHubActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by andrii.kovalchuk on 3/1/17.
 */

@RunWith(AndroidJUnit4::class)
open class CounterActivityTest {
    public @Rule @JvmField val main = ActivityTestRule<CounterActivity>(CounterActivity::class.java)

    @Test
    fun shouldLaunchMainScreen() {
        onView(withText("++")).check(matches(isDisplayed()))
    }

    @Test
    fun clickIncreaseButton_increasesCounter() {
        var counter = 1
        onView(withId(R.id.counterCounter))
                .check(matches(withText(counter.toString())))

        onView(withId(R.id.counterIncrease))
                .perform(click())
        counter++

        onView(withId(R.id.counterCounter))
                .check(matches(withText(counter.toString())))
    }
}
