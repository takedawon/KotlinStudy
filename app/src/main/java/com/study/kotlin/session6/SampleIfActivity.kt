package com.study.kotlin.session6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.study.kotlin.R

class SampleIfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_if)

        val a = 5
        if(a<10) println("$a < 10")

        if(a>10 && a<=10) {
            println("0< $a <= 10")
        } else if(a>10 && a<=10) {
            println("10 < $a <= 20")
        } else {
            println("$a > 20")
        }

        val result = if(a>10) "hello" else "world"
        println(result)

        // 표현식 사용시 else 는 필수

        if(a>10) "hello"  // 성공

        //val result2=if(a>10)"hello" //에러

        val result2 = if(a<10) {
            print("hello")
            10+20
        } else {
            print("world")
            20+20
        }
        println(result2)

        val result3 = if(a>10) 20
        else if(a>20) 30 //else 없으면 에러
        else 40
    }
}
