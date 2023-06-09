package com.example.daggerhiltpractice.domain.repository

import com.example.daggerhiltpractice.data.model.WeatherResponse

/**
//   DaggerHiltPractice
//   Created by Subham Dhakal on 6/8/23.
 */
interface MyAppRepository {
    suspend fun getWeatherByCity(city: String, appid: String): WeatherResponse
    fun getName(): String

}