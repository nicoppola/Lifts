package com.coppola.lifts.di

import com.coppola.lifts.data.LiftsRepository
import com.coppola.lifts.data.LiftsRepositoryImpl
import com.coppola.lifts.main.MainViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    singleOf(::LiftsRepositoryImpl).bind<LiftsRepository>()
    viewModelOf(::MainViewModel)
}