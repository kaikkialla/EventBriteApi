package com.example.test.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test.R
import com.example.test.getDataRepository
import com.example.test.getGeoRepository
import com.example.test.ui.mainFragment.mainFragment


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val geo = getGeoRepository(this)
        val data = getDataRepository(this, geo)

        geo.subscribe()
        data.subscribe()

        supportFragmentManager.beginTransaction().replace(R.id.n, mainFragment()).commit()
    }
}
