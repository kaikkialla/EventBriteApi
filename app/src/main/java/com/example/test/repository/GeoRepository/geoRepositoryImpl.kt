package com.example.test.repository.GeoRepository

import android.content.Context
import android.location.LocationManager
import com.example.test.GeoListener
import com.example.test.model.geoModel
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import android.Manifest.permission
import android.annotation.SuppressLint
import android.app.Activity
import androidx.lifecycle.*


class geoRepositoryImpl(
    val activity: Activity
) : geoRepository {



    override fun subscribe() {
        Dexter.withActivity(activity)
            .withPermissions(
                permission.ACCESS_FINE_LOCATION,
                permission.ACCESS_COARSE_LOCATION
            ).withListener(object : MultiplePermissionsListener {
                @SuppressLint("MissingPermission")
                override fun onPermissionsChecked(report: MultiplePermissionsReport) {/* ... */
                    val l = GeoListener(activity, this@geoRepositoryImpl)
                    val m: LocationManager = activity.getSystemService(Context.LOCATION_SERVICE) as LocationManager
                    m.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 10F, l)
                }

                override fun onPermissionRationaleShouldBeShown(
                    permissions: List<PermissionRequest>,
                    token: PermissionToken
                ) { }
            }).check()
    }



    private val coordinates: MutableLiveData<geoModel> = MutableLiveData()



    override fun getCoordinates() : LiveData<geoModel> {
        return coordinates
    }

    override fun update(coordinates: geoModel?) {
        this.coordinates.value = coordinates
    }


}