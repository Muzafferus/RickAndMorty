package com.muzafferus.rickandmorty.networking

import android.os.Looper
import com.apollographql.apollo.ApolloClient
import com.muzafferus.rickandmorty.util.Util
import okhttp3.OkHttpClient

class RickAndMortyApi{

    fun getApolloClient(): ApolloClient {
        check(Looper.myLooper() == Looper.getMainLooper()) {
            "Only the main thread can get the apolloClient instance"
        }

        val okHttpClient = OkHttpClient.Builder().build()
        return ApolloClient.builder()
            .serverUrl(Util.BASE_URL)
            .okHttpClient(okHttpClient)
            .build()
    }
}