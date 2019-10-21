package com.example.test.ui.mainFragment

import android.content.Context
import android.util.Log
import androidx.lifecycle.Observer
import com.example.test.getDataRepository
import com.example.test.repository.GeoRepository.geoRepository

class mainPresenter(
    override var view: mainContract.View? = null,
    val context: Context,
    val repository: geoRepository
) : mainContract.Presenter {
    override fun onCreate() {
        repository.subscribe()
    }

    override fun onResume() {
        Log.v("gjosogs", "resume ")

        //repository.update(geoModel("a", 0.0, 0.0))

        view!!.let {view ->
            repository.getCoordinates().observe(view, Observer { model ->
                getDataRepository.getList(model).observe(view, Observer { model ->
                            view.setList(model.events!!)
                    })

            })
        }
    }
}