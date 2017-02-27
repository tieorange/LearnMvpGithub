package com.infullmobile.learnmvpgithub.presentation.application.di

import android.app.Application
import com.infullmobile.learnmvpgithub.presentation.application.CounterApplication

/**
 * Created by andrii.kovalchuk on 2/27/17.
 */

object Components{
    fun from(application: Application): ApplicationComponent {
        return (application as CounterApplication).applicationComponent
    }
}

