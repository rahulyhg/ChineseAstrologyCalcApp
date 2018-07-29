package com.alexis.chineseastrology.dagger.general.viewinjector

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper

interface IViewWithActivity {

    val activity: Activity
        get() {
            var context = getContext()
            while (context is ContextWrapper) {
                if (context is Activity) {
                    return context
                }
                context = context.baseContext
            }
            throw IllegalStateException("Context is not from activity: $context")
        }

    fun getContext(): Context?
}