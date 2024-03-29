package com.example.test.ui.mainFragment

import androidx.lifecycle.LifecycleOwner
import com.example.test.model.Event

interface mainContract {
    interface View: LifecycleOwner {
        val presenter: Presenter?

        fun setList(list: List<Event>)
    }

    interface Presenter {
        val view: View?

        fun onResume()
    }
}