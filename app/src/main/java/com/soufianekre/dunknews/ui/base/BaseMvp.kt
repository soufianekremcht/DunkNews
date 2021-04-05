package com.soufianekre.dunknews.ui.base


public interface BaseMvp {

    interface Presenter<V : View> {

        fun onAttach(mvpView: V)
        fun onDetach()


    }

    interface View {


        fun showError(msg :String)
        fun showInfo(msg:String)
        fun showSuccess(msg:String)

    }
}