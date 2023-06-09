package com.example.daggerhiltpractice.data.di

import com.example.daggerhiltpractice.data.repository.MyRepositoryImpl
import com.example.daggerhiltpractice.domain.repository.MyAppRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
//   DaggerHiltPractice
//   Created by Subham Dhakal on 6/8/23.
 */

//Alternative way and recommended way of injecting in dagger hilt
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindsMyRepository(myRepositoryImpl: MyRepositoryImpl): MyAppRepository
}