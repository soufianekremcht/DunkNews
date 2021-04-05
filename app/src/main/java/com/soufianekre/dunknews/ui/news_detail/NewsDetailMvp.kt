package com.soufianekre.dunknews.ui.news_detail

import com.google.android.material.navigation.NavigationView
import com.soufianekre.dunknews.data.models.NewsObject
import com.soufianekre.dunknews.ui.base.BaseMvp

interface NewsDetailMvp {

    interface View : BaseMvp.View, NavigationView.OnNavigationItemSelectedListener{

        fun showNewsArticle()

    }


    interface Presenter<V:View> : BaseMvp.Presenter<V>{
        fun fetchNewsDetail(news : NewsObject)
    }

}