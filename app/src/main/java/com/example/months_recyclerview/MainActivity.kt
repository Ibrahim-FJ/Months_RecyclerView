package com.example.months_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.months_recyclerview.data.DataSource
import com.example.months_recyclerview.model.MonthsModel
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.months_recyclerView)
        recyclerView.adapter = MonthsAdapter(this, DataSource().loadMonths())

    }
}