package com.example.test.view.viewholder

import android.content.Context
import android.view.View
import android.widget.TextView
import com.example.test.R
import com.example.test.model.Event

class mainViewholder(
    view: View
): AbstractViewHolder<Event>(view) {

    private val name: TextView = view.findViewById(R.id.event_name)
    override fun bind(item: Event) {

        name.text = item.description!!.text
    }
}