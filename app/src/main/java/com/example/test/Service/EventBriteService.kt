package com.example.test.Service

import com.example.test.Model.model
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "ATHSKTMQRPREBXNDJWXD"

const val tokenQuery = "&token=$API_KEY"

const val query = "search?$tokenQuery"

interface EventBriteService {


//    @GET(query2)
//    fun getBalance() : Call<model>

    @GET(query)
    fun getEvents(
        @Query("location.address") adress: String,
        @Query("location.within") within: String
    ) : Call<model>

    @GET(query)
    fun getEvents(
        @Query("location.longitude") longitude: Double,
        @Query("location.latitude") latitude: Double,
        @Query("location.within") within: String
    ) : Call<model>
}