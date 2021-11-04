package com.example.months_recyclerview.data

import com.example.months_recyclerview.R
import com.example.months_recyclerview.model.MonthsModel

class DataSource {

    fun loadMonths(): List<MonthsModel> {
        return listOf(
            MonthsModel(R.string.january),
            MonthsModel(R.string.february),
            MonthsModel(R.string.march),
            MonthsModel(R.string.april),
            MonthsModel(R.string.may),
            MonthsModel(R.string.june),
            MonthsModel(R.string.july),
            MonthsModel(R.string.august),
            MonthsModel(R.string.september),
            MonthsModel(R.string.october),
            MonthsModel(R.string.november),
            MonthsModel(R.string.december),
        )

    }
}