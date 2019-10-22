package com.example.test.repository.DataRepository

import android.util.Log
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.test.model.event
import com.example.test.model.location
import com.example.test.repository.GeoRepository.geoRepository
import com.example.test.service.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class dataRepositoryImpl(
    val activity: FragmentActivity,
    val geoRepository: geoRepository
) : dataRepository {


    override fun subscribe() {
        geoRepository.getCoordinates().observe(activity, Observer {
            loadByCity(it)
        })
    }


    override fun list(): LiveData<event> = list

    val list: MutableLiveData<event> = MutableLiveData()





    fun loadByCity(coordinates: location) {
        Service.etherscanServices?.getEvents(coordinates.city!!, "50km")!!
            .enqueue(object : Callback<event> {
                override fun onResponse(call: Call<event>, response: Response<event>) {
                    Log.e("fasofa", "on response")
                    if (response.body() != null) {
                        list.value = response.body()
                        Log.e("fasofa", "response")
                    }
                }

                override fun onFailure(call: Call<event>, t: Throwable) { }
            })
    }


    fun loadByCoordinates(coordinates: location) {
        Service.etherscanServices?.getEvents(coordinates.longitude!!, coordinates.longitude!!, "50km")!!
            .enqueue(object : Callback<event> {
                override fun onResponse(call: Call<event>, response: Response<event>) {
                    if (response.body() != null) {
                        list.value = response.body()
                        Log.e("fasofa", "on response")
                    }
                }

                override fun onFailure(call: Call<event>, t: Throwable) { }
            })
    }
}