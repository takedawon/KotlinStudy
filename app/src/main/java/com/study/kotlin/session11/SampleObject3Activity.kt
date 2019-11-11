package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleObject3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_object3)

        val obj1:NormalClass = NormalClass()
        val obj2:NormalClass = NormalClass()
        obj1.myFun()

        // val obj3:ObjectClass=ObjectClass() 에러 object 클래스는 객체생성이 안됨.

        ObjectClass.myFun()

    }
}

class NormalClass {
    fun myFun(){ }
}

object ObjectClass {
    fun myFun(){}
}
