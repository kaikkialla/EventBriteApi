package com.example.test.ui.mainFragment

import androidx.lifecycle.LifecycleOwner
import com.example.test.model.geoModel

interface mainContract {
    interface View: LifecycleOwner {
        val presenter: Presenter?

        fun swapCoordinates(coords: geoModel)
    }

    interface Presenter {
        val view: View?

        fun onCreate()

        fun onResume()
    }
}