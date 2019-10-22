package com.example.test.ui.mainFragment

import android.util.Log
import androidx.lifecycle.Observer
import com.example.test.repository.DataRepository.dataRepository

class mainPresenter(
    override var view: mainContract.View? = null,
    private val repository: dataRepository
) : mainContract.Presenter {


    override fun onResume() {
        view!!.let {view ->
            repository.list().observe(view, Observer { model ->
                view.setList(model.events!!)
            })
        }
    }
}