package com.maschago.modeshop.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

fun provideAppModules(): List<Module> =
    listOf(
        persistenceModule,
        repositoryModule,
        viewModelModule,
        networkModule
    )

val repositoryModule = module {}

val viewModelModule = module {}

val networkModule = module {}

val persistenceModule = module {}