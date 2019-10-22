package com.example.test.repository.GeoRepository

import androidx.lifecycle.LiveData
import com.example.test.model.location

interface geoRepository {

    fun getCoordinates(): LiveData<location>

    fun subscribe()

    fun update(coordinates: location?)
}