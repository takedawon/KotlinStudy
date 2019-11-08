package com.study.kotlin.session6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleLogicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_logical)

        print("true && true : ${true && true}")
        print("true && false : ${true && false}")
        print("true || true : ${true || true}")
        print("true || false : ${true || false}")
        print("!true : ${!true}")
    }
}
