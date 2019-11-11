package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleNestedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_nested)

        //val obj:Outer.Nested = Outer.Nested() //ERROR
        val obj:Outer.Nested = Outer().createNested()
        val obj2:Outer.Nested = Outer().Nested()
        println("${obj.name}")
        println("${obj2.myFun()}")

    }
}

class Outer {
    private var no:Int = 10
    fun outerFun() {
        println("outerFun()...")
    }
    inner class Nested {
        val name:String = "kkang"
        fun myFun() {
            println("Nested..myFun...")
            //no = 20 // inner키워드를 사용하지 않은 Nested 클래스는 Outer 프로퍼티와 함수에 접근 하지 못한다.
            //outerFun()
            no=20
            outerFun()
        }
    }
    fun createNested():Nested {
        return Nested()
    }
}
