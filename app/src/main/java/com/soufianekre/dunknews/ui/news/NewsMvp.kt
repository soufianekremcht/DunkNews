package com.soufianekre.dunknews.ui.news

import com.google.android.material.navigation.NavigationView
import com.soufianekre.dunknews.data.models.NewsObject
import com.soufianekre.dunknews.ui.base.BaseMvp

interface NewsMvp {

    interface View : BaseMvp.View{


        fun showNews(newsList : List<NewsObject>){

        }

    }


    interface Presenter<V:View> : BaseMvp.Presenter<V>{

        fun fetchLatestNews(newsType :String)
    }
}