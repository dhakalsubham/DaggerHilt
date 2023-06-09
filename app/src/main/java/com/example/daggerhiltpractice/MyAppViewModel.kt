package com.example.daggerhiltpractice

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerhiltpractice.domain.repository.MyAppRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

/**
//   DaggerHiltPractice
//   Created by Subham Dhakal on 6/8/23.
 */
@HiltViewModel
class MyAppViewModel @Inject constructor(
    private val myAppRepository: MyAppRepository,
    private val app: Application
) : ViewModel() {
//    private val myAppRepository: Lazy<MyAppRepository>, lazy implementation
//    of MyAppRepository, make sure it is imported from dagger

    init {
        viewModelScope.launch {
            getWeatherByCity()
            println(myAppRepository.getName())
            println("Hello from ViewModel  ${app.getString(R.string.app_name)}")
        }
    }

    suspend fun getWeatherByCity() {
        println(
            myAppRepository.getWeatherByCity(
                "Sussex",
                "07c11f39ade5105940541504e2501488"
            )
        )
    }
}