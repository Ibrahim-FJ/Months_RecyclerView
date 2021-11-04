package com.example.months_recyclerview.data

import com.example.months_recyclerview.R
import com.example.months_recyclerview.model.MonthsModel

class DataSource {

    fun loadMonths(): List<MonthsModel> {
        return listOf(
            MonthsModel(R.string.january, R.drawable.january),
            MonthsModel(R.string.february, R.drawable.february),
            MonthsModel(R.string.march, R.drawable.march),
            MonthsModel(R.string.april, R.drawable.april),
            MonthsModel(R.string.may, R.drawable.may),
            MonthsModel(R.string.june, R.drawable.june),
            MonthsModel(R.string.july, R.drawable.july),
            MonthsModel(R.string.august, R.drawable.augest),
            MonthsModel(R.string.september, R.drawable.september),
            MonthsModel(R.string.october, R.drawable.october),
            MonthsModel(R.string.november, R.drawable.november),
            MonthsModel(R.string.december, R.drawable.december),
        )

    }
}