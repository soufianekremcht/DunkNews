package com.soufianekre.dunknews.ui.news

import com.soufianekre.dunknews.data.models.NewsObject
import com.soufianekre.dunknews.ui.base.BasePresenter

class NewsPresenter<V: NewsMvp.View> : BasePresenter<V>(), NewsMvp.Presenter<V> {



    fun fetchLatestNews(newsType :String){

        var results = ArrayList<NewsObject>()
        // fetch News

        getMvpView()!!.showNews(results)
    }


}