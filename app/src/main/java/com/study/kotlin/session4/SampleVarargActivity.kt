package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleVarargActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_varang)
        varangFun(1,"123")
        varangFun(2,123)

    }

    fun <T> varangFun(a1:Int, vararg array:T) {
        for(a in array)
            println(a)
    }
}
