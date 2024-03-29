package com.example.test.service

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val baseUrl = "https://www.eventbriteapi.com/v3/events/"

object Service {
    var etherscanService: EventBriteService? = null

    val etherscanServices: EventBriteService?
        get() {
            var service: EventBriteService? = null
            if (etherscanService == null) {
                val gson = GsonBuilder().setLenient().create()
                val retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()

                service = retrofit.create<EventBriteService>(EventBriteService::class.java)
            }
            return service
        }
}