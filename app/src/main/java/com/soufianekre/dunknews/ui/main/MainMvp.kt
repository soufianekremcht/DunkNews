package com.soufianekre.dunknews.ui.main

import com.google.android.material.navigation.NavigationView
import com.soufianekre.dunknews.ui.base.BaseMvp


interface MainMvp {

    interface View : BaseMvp.View,NavigationView.OnNavigationItemSelectedListener{


    }


    interface Presenter<V:View> : BaseMvp.Presenter<V>{

    }

}

