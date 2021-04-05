package com.soufianekre.dunknews.helpers.rx

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object RxSchedulerProvider : RxScheduler{
    override fun io(): Scheduler {
        return Schedulers.io()
    }

    override fun ui(): Scheduler{
        return AndroidSchedulers.mainThread()
    }

    override fun computation(): Scheduler {
        return Schedulers.computation()
    }


}