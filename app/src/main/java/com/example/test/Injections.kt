package com.example.test

import android.app.Activity
import androidx.fragment.app.FragmentActivity
import com.example.test.repository.DataRepository.dataRepository
import com.example.test.repository.DataRepository.dataRepositoryImpl
import com.example.test.repository.GeoRepository.geoRepository
import com.example.test.repository.GeoRepository.geoRepositoryImpl


fun getGeoRepository(activity: Activity): geoRepository = geoRepositoryImpl(activity)


fun  getDataRepository(
    activity: FragmentActivity,
    repository: geoRepository
): dataRepository = dataRepositoryImpl(activity, repository)
