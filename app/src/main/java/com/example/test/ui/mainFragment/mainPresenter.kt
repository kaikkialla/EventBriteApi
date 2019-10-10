package com.example.test.ui.mainFragment

import android.util.Log
import androidx.lifecycle.Observer
import com.example.test.repository.GeoRepository.geoRepository

class mainPresenter(
    override var view: mainContract.View? = null,
    val repository: geoRepository
) : mainContract.Presenter {
    override fun onCreate() {
        repository.subscribe()
    }

    override fun onResume() {
        Log.v("gjosogs", "resume ")

        //repository.update(geoModel("a", 0.0, 0.0))

        view!!.let {view ->
            repository.getCoordinates().observe(view, Observer {
                Log.v("gjosogs", "observe  ${it.city}")
                view.swapCoordinates(it!!)
            })
        }
    }
}