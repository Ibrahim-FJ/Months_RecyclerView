package com.example.months_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.months_recyclerview.data.DataSource
import com.example.months_recyclerview.model.MonthsModel

class MonthsAdapter(private val context: Context,private val monthsSet: List<MonthsModel>):
    RecyclerView.Adapter<MonthsAdapter.MonthsViewHolder>() {

    class MonthsViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val monthsView: TextView = view.findViewById(R.id.months_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthsViewHolder {
       return MonthsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_months, parent, false))
    }

    override fun onBindViewHolder(holder: MonthsViewHolder, position: Int) {
        holder.monthsView.text = context.resources.getString(monthsSet[position].resourceId)
    }

    override fun getItemCount(): Int {
        return monthsSet.size
    }
}