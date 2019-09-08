package com.study.kotlin.session6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleArithmeticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_arithmetic)
        val data3 = 10
        val data4 = 5

        println(data3 + data4)
        println(data3 - data4)
        println(data3 * data4)
        println(data3 / data4)
        println(data3 % data4)
    }
}
