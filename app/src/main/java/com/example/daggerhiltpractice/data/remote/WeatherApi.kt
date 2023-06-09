package com.example.daggerhiltpractice.data.remote

import com.example.daggerhiltpractice.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
//   DaggerHiltPractice
//   Created by Subham Dhakal on 6/8/23.
 */
interface WeatherApi {
    @GET("data/2.5/weather")
    suspend fun getWeatherByCity(
        @Query("q") city: String,
        @Query("appid") appId: String
    ): WeatherResponse
}