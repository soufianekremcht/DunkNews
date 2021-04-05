package com.soufianekre.dunknews

import android.app.Application
import timber.log.Timber

public class DunkNewsApp : Application(){


    override fun onCreate() {
        super.onCreate()
        instance = this
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())

    }

    companion object{
        private var instance : DunkNewsApp? = null

        fun getInstance() : DunkNewsApp{
            return instance!!
        }
    }

}