package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleObject2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_object2)

        val obj = Outer3()
        obj.myInner.someClassFun()
    }
}


interface SomeInterface {
    fun interfaceFun()
}
open class SomeClass {
    fun someClassFun() {
        println("someClassFun....")
    }
}

class Outer3 {
    val myInner : SomeClass = object : SomeClass(), SomeInterface {
        override fun interfaceFun() {
            println("interfaceFun....")
        }
    }
}