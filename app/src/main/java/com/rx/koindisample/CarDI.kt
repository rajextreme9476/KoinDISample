package com.rx.koindisample

import android.util.Log

class CarDI(private val engine:Engine , private val  wheel: Wheel) {

    fun getCarDi(){
        engine.getEngine();
        wheel.getWheel()
        Log.d("CarDI","Car is Running")
    }
}
class Engine {

    fun getEngine(){
        Log.d("Engine","Engine is Running")
    }


}class Wheel {

    fun getWheel(){
        Log.d("Wheel","Wheel is Running")
    }
}