package com.example.test.repository.GeoRepository

import androidx.lifecycle.LiveData
import com.example.test.model.geoModel

interface geoRepository {

    fun getCoordinates(): LiveData<geoModel>

    fun subscribe()

    fun update(coordinates: geoModel?)
}