package com.rx.koindisample.container

import com.rx.koindisample.CarDI
import com.rx.koindisample.Engine
import com.rx.koindisample.Wheel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Component : KoinComponent {
    val engine : Engine by inject()
    val wheel : Wheel by inject()
    val carDi : CarDI by inject()
}