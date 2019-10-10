package com.example.test.ui.mainFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.test.model.geoModel
import com.example.test.R
import com.example.test.getDataRepository
import com.example.test.getGeoRepository

class mainFragment : Fragment(), mainContract.View, LifecycleOwner {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment_layout, container, false)
    }


    override var presenter: mainContract.Presenter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val repository = getGeoRepository(activity!!)
        presenter = mainPresenter(this, repository)

        presenter!!.onCreate()
    }

    override fun onResume() {
        super.onResume()
        presenter!!.onResume()
    }

    override fun swapCoordinates(coords: geoModel) {
        getDataRepository.getList(coords).observe(this, Observer {
            Log.e("gjosogs", it.location!!.address)
        })
    }

}