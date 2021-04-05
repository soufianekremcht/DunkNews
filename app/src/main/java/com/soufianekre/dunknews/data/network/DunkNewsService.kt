package com.soufianekre.dunknews.data.network

import retrofit2.http.GET
import retrofit2.http.Path

interface DunkNewsService {

    @GET("dunknews/")
    fun getNews(@Path("type") newsType :String)
    @GET("dunknews/")
    fun getNewsDetail()
}