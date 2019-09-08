package com.study.kotlin.session6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleBreakActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_break)

        var x2=0
        var sum2=0

        while(true) {
            sum2+= ++x2
            if(x2==10) break
        }
        println(sum2)

        for(i in 1..3) {
            for (j in 1..3) {
                println("i : $i , j : $j")
            }
        }

        for(i in 1..3) {
            for (j in 1..3) {
                if(j>1) break
                println("i : $i , j : $j")
            }
        }

        aaa@ for(i in 1..3) { // 라벨
            for (j in 1..3) {
                if(j>1) break@aaa
                println("i : $i , j : $j")
            }
        }


    }
}
