package com.example.covidtracker

import com.google.gson.annotations.SerializedName

data class CovidData(
    val dateChecked:String,
    val poitiveIncrease:Int,
     val negativeIncrease: Int,
      val deathIncrease:Int,
     val state:String
)