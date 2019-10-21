package com.example.test.ui.mainFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.model.geoModel
import com.example.test.R
import com.example.test.getDataRepository
import com.example.test.getGeoRepository
import com.example.test.model.Event
import com.example.test.view.adapter.mainAdapter
import kotlinx.android.synthetic.main.main_fragment_layout.*

class mainFragment : Fragment(), mainContract.View, LifecycleOwner {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment_layout, container, false)
    }

    val adapter:mainAdapter by lazy {
        return@lazy mainAdapter(context!!)
    }

    override var presenter: mainContract.Presenter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val repository = getGeoRepository(activity!!)
        presenter = mainPresenter(this, context!!, repository)

        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(context)

        presenter!!.onCreate()
    }

    override fun onResume() {
        super.onResume()
        presenter!!.onResume()
    }

    override fun setList(list: List<Event>) {
        adapter.swap(list)
    }

}