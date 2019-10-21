package com.example.test.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.model.Event
import com.example.test.model.model2
import com.example.test.view.viewholder.mainViewholder

class mainAdapter(
    private val context: Context
): RecyclerView.Adapter<mainViewholder>() {


    private var items: List<Event> = ArrayList()

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int) = mainViewholder (
        LayoutInflater.from(viewGroup.context).inflate(R.layout.list_item, viewGroup, false),
        context
    ).apply {

    }



    override fun getItemCount(): Int {
        return items.size
    }


    override fun onBindViewHolder(holder: mainViewholder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    fun swap(list: List<Event>) {
        this.items = list
        notifyDataSetChanged()
    }
}