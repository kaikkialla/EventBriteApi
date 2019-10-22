package com.example.test

import android.app.Activity
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationListener
import android.os.Bundle
import com.example.test.model.location

import com.example.test.repository.GeoRepository.geoRepository
import java.io.IOException
import java.util.*

class GeoListener(
    val activity: Activity,
    val repository: geoRepository
) : LocationListener {

    override fun onLocationChanged(loc: Location) {
        val longitude: Double = loc.longitude
        val latitude: Double =loc.latitude


        var cityName:String? = null
        val gcd = Geocoder(activity, Locale.getDefault())
        val addresses:List<Address>
        try {
            addresses = gcd.getFromLocation(loc.latitude,
                loc.longitude, 1)
            if (addresses.size > 0) {
                cityName = addresses[0].locality
            }
        }
        catch (e: IOException) {
            e.printStackTrace()
        }

        repository.update(
            location(
                cityName,
                longitude,
                latitude
            )
        )

    }

    override fun onProviderDisabled(provider:String) {}

    override fun onProviderEnabled(provider:String) {}

    override fun onStatusChanged(provider:String, status:Int, extras: Bundle) {}
}
