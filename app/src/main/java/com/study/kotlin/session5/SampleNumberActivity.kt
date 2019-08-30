package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleNumberActivity : AppCompatActivity() {

    val intData:Int = 10
    val result = intData.minus(5)
    val oneMillion:Int = 1_000_000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_number)
        println(result)
        println(oneMillion)
    }
}
