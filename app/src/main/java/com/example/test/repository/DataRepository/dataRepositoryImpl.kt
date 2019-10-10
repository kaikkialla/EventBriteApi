package com.example.test.repository.DataRepository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.test.model.geoModel
import com.example.test.model.model
import com.example.test.service.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class dataRepositoryImpl : dataRepository {


    override fun getList(coordinates: geoModel): LiveData<model> {
        loadByCity(coordinates)
        return list
    }

    val list: MutableLiveData<model> = MutableLiveData()



    fun loadByCity(coordinates: geoModel) {
        Service.etherscanServices?.getEvents(coordinates.city!!, "50km")!!
            .enqueue(object : Callback<model> {
                override fun onResponse(call: Call<model>, response: Response<model>) {
                    if (response.body() != null) {
                        list.value = response.body()
                    }
                }

                override fun onFailure(call: Call<model>, t: Throwable) { }
            })
    }


    fun loadByCoordinates(coordinates: geoModel) {
        Service.etherscanServices?.getEvents(coordinates.longitude!!, coordinates.longitude!!, "50km")!!
            .enqueue(object : Callback<model> {
                override fun onResponse(call: Call<model>, response: Response<model>) {
                    if (response.body() != null) {
                        list.value = response.body()
                    }
                }

                override fun onFailure(call: Call<model>, t: Throwable) { }
            })
    }
}