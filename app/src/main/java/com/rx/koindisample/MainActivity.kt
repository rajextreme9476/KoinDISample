package com.rx.koindisample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rx.koindisample.container.Component
import org.koin.java.KoinJavaComponent.inject

class MainActivity : AppCompatActivity() {
    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.carDi.getCarDi()
    }
}