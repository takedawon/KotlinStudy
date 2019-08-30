package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.study.kotlin.R

class SampleCharActivity : AppCompatActivity() {

    val isTrue1:Boolean = true&&false
    val isTrue2:Boolean = true || false
    val isTrue3:Boolean = !true

    val charData = 'C'

    var str:String = "Hello"

    fun check(c:Char) {
        //if(c==1) 에러 발생 : 코틀린의 Char 타입은 Number 타입으로 표현되지 않음.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_char)
        println(isTrue1)
        println(isTrue2)
        println(isTrue3)
        Toast.makeText(this,"str[1] : " + str[1],Toast.LENGTH_SHORT).show()
    }
}
