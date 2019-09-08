package com.study.kotlin.session6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleWhileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_while)

        var x=0
        var sum1=0
        while (x<10) {
            sum1 += ++x
        }
        println(sum1)
    }
}
