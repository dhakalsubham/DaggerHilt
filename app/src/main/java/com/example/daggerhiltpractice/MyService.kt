package com.example.daggerhiltpractice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhiltpractice.domain.repository.MyAppRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
//   DaggerHiltPractice
//   Created by Subham Dhakal on 6/9/23.
 */
@AndroidEntryPoint
class MyService:Service() {

    //filed injection
    @Inject
    lateinit var repository: MyAppRepository

    override fun onCreate() {
        super.onCreate()
        //injection happens after on create and super
        repository.getName()
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}