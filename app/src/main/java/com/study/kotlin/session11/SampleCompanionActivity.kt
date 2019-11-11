package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleCompanionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_companion)
        val obj = Outer4()

        Outer4.NestedClass.no
        Outer4.NestedClass.myFun()

        Outer4.no
        Outer4.myFun()
    }
}

class Outer4 {
    companion object NestedClass {
        val no:Int = 0
        fun myFun() {}
    }

    fun myFun() {
        no
        myFun()
    }
}
