package com.example.test.repository.DataRepository

import androidx.lifecycle.LiveData
import com.example.test.model.event

interface dataRepository {

    fun list(): LiveData<event>

    fun subscribe()
}