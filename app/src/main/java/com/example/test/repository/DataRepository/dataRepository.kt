package com.example.test.repository.DataRepository

import androidx.lifecycle.LiveData
import com.example.test.model.geoModel
import com.example.test.model.model
import com.example.test.model.model2

interface dataRepository {

    fun getList(coordinates: geoModel): LiveData<model2>
}