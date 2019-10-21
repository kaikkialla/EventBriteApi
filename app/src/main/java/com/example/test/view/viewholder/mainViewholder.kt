package com.example.test.view.viewholder

import android.content.Context
import android.view.View
import android.widget.TextView
import com.example.test.R
import com.example.test.model.Event
import java.text.SimpleDateFormat
import java.util.*

class mainViewholder(
    view: View,
    private val context: Context
): AbstractViewHolder<Event>(view) {

    private val name: TextView = view.findViewById(R.id.event_name)
//    private val timestamp: TextView = view.findViewById(R.id.timestamp)
//    private val id: TextView = view.findViewById(R.id.id)

    override fun bind(item: Event) {

        name.text = item.description!!.text

//        value.text = "${item.value}"
//
//        //val string = context.getString(R.string.date)
//        val format1 = SimpleDateFormat("dd/MM", Locale.ROOT)
//        val format2 = SimpleDateFormat("kk:mm", Locale.ROOT)
//        val date = item.timestamp
//        timestamp.text = String.format(string, format1.format(date), format2.format(date))
    }
}