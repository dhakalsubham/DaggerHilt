package com.example.daggerhiltpractice.data.repository

import android.app.Application
import com.example.daggerhiltpractice.R
import com.example.daggerhiltpractice.data.model.WeatherResponse
import com.example.daggerhiltpractice.data.remote.WeatherApi
import com.example.daggerhiltpractice.domain.repository.MyAppRepository
import javax.inject.Inject

/**
//   DaggerHiltPractice
//   Created by Subham Dhakal on 6/8/23.
 */
class MyRepositoryImpl @Inject constructor(
    private val weatherApi: WeatherApi,
    private val name: String,
    private val app: Application
) : MyAppRepository {
    init {
        println("Hello from ${app.getString(R.string.app_name)}")
    }

    override suspend fun getWeatherByCity(city: String, appid: String): WeatherResponse {
        return weatherApi.getWeatherByCity(city, appid)
    }

    override fun getName(): String {
        return name
    }

}

