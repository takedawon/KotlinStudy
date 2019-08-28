package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleArgumentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_argument)
        sayHello2(null)
        sayHello3(no=10)
        sayHello3(name="kim",no=10) // 명명된 인수 (named argument)
    }

    fun sayHello(name:String) {
        println("hello"+name)
    }
    fun sayHello2(name:String?) {
        if(name == null) {
            println("Hello! kkang!")
        } else {
            println("hello! "+name)
        }
    }
    fun sayHello3(name:String = "kkang") {  // 기본 인수(default argument)
        println("hello!"+name)
    }
    fun sayHello3(name:String="kkang", no:Int) {
        println("Hello!"+name)
    }
}
