package com.example.test.repository.DataRepository

import androidx.lifecycle.LiveData
import com.example.test.model.geoModel
import com.example.test.model.model

interface dataRepository {

    fun getList(coordinates: geoModel): LiveData<model>
}