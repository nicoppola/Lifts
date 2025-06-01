package com.coppola.lifts.di

import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.core.module.dsl.singleOf
import com.coppola.lifts.data.DbClient

actual val platformModule: Module = module {
    singleOf(::DbClient)
}