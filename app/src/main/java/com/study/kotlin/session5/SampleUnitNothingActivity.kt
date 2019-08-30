package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleUnitNothingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_unit_nothing)
    }

    fun myFun1() {

    }
    fun myFun2():Unit {

    }
    fun myFun(arg:Nothing?):Nothing {
        throw Exception()
    }
}
