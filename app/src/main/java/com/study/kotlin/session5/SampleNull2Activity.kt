package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleNull2Activity : AppCompatActivity() {

    //val a:Int = null 에러 발생 표현식 뒤에 ? 를 붙여줘야 함.
    val b:Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_null2)
    }

    fun parseInt(str:String):Int? {
        return str.toIntOrNull()
    }
}
