package com.example.months_recyclerview

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.months_recyclerview.data.DataSource
import com.example.months_recyclerview.model.MonthsModel

class MonthsAdapter(private val context: Context,private val monthsSet: List<MonthsModel>):
    RecyclerView.Adapter<MonthsAdapter.MonthsViewHolder>() {

    class MonthsViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val monthsText: TextView = view.findViewById(R.id.months_text)
        val monthsImage: ImageView = view.findViewById(R.id.months_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthsViewHolder {
       return MonthsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_months_images, parent, false))
    }

    override fun onBindViewHolder(holder: MonthsViewHolder, position: Int) {
        val item = monthsSet[position]
        holder.monthsText.text = context.resources.getString(item.resourceId)
        holder.monthsImage.setImageResource(item.imageId)
    }

    override fun getItemCount(): Int {
        return monthsSet.size
    }
}