package com.soufianekre.dunknews.helpers.rx

import io.reactivex.Scheduler

interface RxScheduler {

    fun io() : Scheduler
    fun ui() : Scheduler
    fun computation() : Scheduler
}