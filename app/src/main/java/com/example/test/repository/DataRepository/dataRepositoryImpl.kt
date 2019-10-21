package com.example.test.repository.DataRepository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.test.model.geoModel
import com.example.test.model.model2
import com.example.test.service.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class dataRepositoryImpl : dataRepository {


    override fun getList(coordinates: geoModel): LiveData<model2> {
        loadByCoordinates(coordinates)
        return list
    }

    val list: MutableLiveData<model2> = MutableLiveData()



    fun loadByCity(coordinates: geoModel) {
        Service.etherscanServices?.getEvents("la", "50km")!!
            .enqueue(object : Callback<model2> {
                override fun onResponse(call: Call<model2>, response: Response<model2>) {
                    Log.e("fasofa", "on response")
                    if (response.body() != null) {
                        list.value = response.body()
                        Log.e("fasofa", "response")
                    }
                }

                override fun onFailure(call: Call<model2>, t: Throwable) { }
            })
    }


    fun loadByCoordinates(coordinates: geoModel) {
        Service.etherscanServices?.getEvents(coordinates.longitude!!, coordinates.longitude!!, "50km")!!
            .enqueue(object : Callback<model2> {
                override fun onResponse(call: Call<model2>, response: Response<model2>) {
                    if (response.body() != null) {
                        list.value = response.body()
                        Log.e("fasofa", "on response")
                    }
                }

                override fun onFailure(call: Call<model2>, t: Throwable) { }
            })
    }
}