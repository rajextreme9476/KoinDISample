package com.rx.koindisample.di

import com.rx.koindisample.CarDI
import com.rx.koindisample.Engine
import com.rx.koindisample.Wheel
import org.koin.dsl.module

val koinDIModule = module {
    factory { Engine() }
    factory { Wheel() }
    factory { CarDI(get(),get()) }
}