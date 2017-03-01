package com.infullmobile.learnmvpgithub.presentation.common

import android.app.Activity
import android.content.Intent
import com.infullmobile.android.infullmvp.LaunchableIntent

/**
 * Created by andrii.kovalchuk on 3/1/17.
 */
open class LaunchableIntentExtended(
        private val activity: Activity,
        private val intentClass: Class<out Activity>) {

    private val intent = Intent(activity, intentClass)

    open fun start() {
        activity.startActivity(intent)
    }

    open fun startAndFinishCurrent() {
        activity.startActivity(intent)
        activity.finish()
    }

    open fun startForResult(requestCode: Int) {
        activity.startActivityForResult(intent, requestCode)
    }

}