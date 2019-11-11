package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_object)

        val obj = Outer2()
        obj.outerFun()
    }
}

class Outer2 {
    private var no:Int = 10

    private val myInner = object {
        val name: String = "kkang"
        fun innerFun() {
            println("innerFun....")
            no++
        }
    }

    fun outerFun() {
        myInner.name
        myInner.innerFun()
    }

}

