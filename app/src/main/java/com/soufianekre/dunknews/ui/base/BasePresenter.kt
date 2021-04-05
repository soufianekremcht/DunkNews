package com.soufianekre.dunknews.ui.base

import com.soufianekre.dunknews.data.AppDataManager
import com.soufianekre.dunknews.data.DataManager
import io.reactivex.disposables.CompositeDisposable


abstract class BasePresenter<V : BaseMvp.View> : BaseMvp.Presenter<V>{



    private val mDataManager: DataManager = AppDataManager()
    private val mCompositeDisposable = CompositeDisposable()


    private var mvpView: V? = null



    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }

    override fun onDetach() {
        mCompositeDisposable.dispose()
        mvpView = null
    }

    open fun isViewAttached(): Boolean {
        return mvpView != null
    }

    open fun getMvpView(): V? {
        return mvpView
    }

    open fun checkViewAttached() {
        if (!isViewAttached()) throw MvpViewNotAttachedException()
    }


    open fun getDataManager(): DataManager? {
        return mDataManager
    }


    open fun getCompositeDisposable(): CompositeDisposable? {
        return mCompositeDisposable
    }

    class MvpViewNotAttachedException internal constructor() : RuntimeException(
        "Please call Presenter.onAttach(MvpView) before" +
                " requesting data to the Presenter"
    )


}