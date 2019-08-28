package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleOverloadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_overloading)

        some("hello")
        some(10)
        some(10,"hello")

    }

    fun some(a:String) {
        println("soume(a:String) call....")
    }
    fun some(a:Int) {
        println("some(a:Int) call....")
    }
    fun some(a:Int, b:String) {
        println("some(a:Int, b:String) call....")
    }
}
