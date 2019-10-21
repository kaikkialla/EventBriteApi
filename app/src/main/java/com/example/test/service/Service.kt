package com.example.test.service

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import com.google.gson.GsonBuilder


object Service {
    var etherscanService: EventBriteService? = null

    val etherscanServices: EventBriteService?
        get() {
            var service: EventBriteService? = null
            if (etherscanService == null) {
                val gson = GsonBuilder().setLenient().create()
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://www.eventbriteapi.com/v3/events/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()

                service = retrofit.create<EventBriteService>(EventBriteService::class.java)
            }
            return service
        }
}