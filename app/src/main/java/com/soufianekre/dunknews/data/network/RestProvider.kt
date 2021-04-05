package com.soufianekre.dunknews.data.network

import com.soufianekre.dunknews.BuildConfig
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object RestProvider {

    private var REST_URL : String = "url"

    private  var okHttpClient : OkHttpClient? = null

    public var moshi : Moshi = Moshi.Builder().build()


    fun provideOkHttpClient() : OkHttpClient{
        if (okHttpClient == null){
            var client : OkHttpClient.Builder  = OkHttpClient.Builder()
            if (BuildConfig.DEBUG){
                client.addInterceptor(HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY));
            }
            //client.addInterceptor(PaginationInterceptor())
            okHttpClient = client.build()
        }
        return okHttpClient!!
    }


    private fun provideRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(REST_URL)
            .client(provideOkHttpClient())
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    public fun provideNewsService() : DunkNewsService{
        return provideRetrofit().create(DunkNewsService::class.java)
    }

}