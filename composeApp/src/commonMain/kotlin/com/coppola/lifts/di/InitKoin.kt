package com.coppola.lifts.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.includes

fun initKoin(config : KoinAppDeclaration? = null){
    startKoin {
        printLogger()
        includes(config)
        modules(sharedModule, platformModule)
    }
}