package com.study.kotlin.session6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleForActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_for)

        var sum:Int = 0
        for(i in 1..10) {
            sum+=i
        }
        println(sum)

        val list = listOf<String>("hello", "world","!")
        val sb=StringBuffer()

        for(str in list) {
            sb.append(str)
        }
        println(sb)

        val list2=listOf("hello","world","!")
        for(i in list.indices) {
            println(list[i])
        }

        for ((index, value) in list.withIndex()) {
            println("$index $value")
        }

        for (i in 1..100){} // 100까지 포함

        for(i in 1 until 100){} //100은 포함하지 않음.

        for (x in 2..10 step 2) {} // 2씩 증가
        for (x in 10 downTo 1) {} //숫자감소

        for(i in 1 until 11 step 2) { // 11은 포함하지 않음.
            println(i) // 결과값 1 3 5 7 9
        }


    }
}
