package com.example.daggerhiltpractice.data.di

import android.app.Application
import com.example.daggerhiltpractice.data.remote.WeatherApi
import com.example.daggerhiltpractice.data.repository.MyRepositoryImpl
import com.example.daggerhiltpractice.domain.repository.MyAppRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

/**
//   DaggerHiltPractice
//   Created by Subham Dhakal on 6/8/23.
 */

@Module
@InstallIn(SingletonComponent::class)
object MyAppModule {

    @Provides
    @Singleton
    fun providesWeatherApi(): WeatherApi {
        return Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(WeatherApi::class.java)
    }

//    @Provides
//    @Singleton
//    fun providesRepository(weatherApi: WeatherApi, name: String, app: Application): MyAppRepository {
//        return MyRepositoryImpl(weatherApi, name, app)
//    }

    @Provides
    @Singleton
    fun providesString(): String {
        return "My name is Subham"
    }

}