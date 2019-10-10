package com.example.test

import android.app.Activity
import com.example.test.repository.DataRepository.dataRepository
import com.example.test.repository.DataRepository.dataRepositoryImpl
import com.example.test.repository.GeoRepository.geoRepository
import com.example.test.repository.GeoRepository.geoRepositoryImpl


fun getGeoRepository(activity: Activity): geoRepository = geoRepositoryImpl(activity)

val getDataRepository: dataRepository = dataRepositoryImpl()
