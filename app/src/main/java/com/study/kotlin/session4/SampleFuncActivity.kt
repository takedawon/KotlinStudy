package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleFuncActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_func)

        var result:Int=sum4(5,4)
        print(result)
    }

    fun sum(a:Int, b:Int):Int { // 함수 매개변수는 무조건 val로 선언됨.
        return a+b
    }
    fun sum2(a:Int, b:Int):Unit { // 반환값이 void일 경우 Unit으로 지정.
        print(a+b)
    }
    fun sum3(a:Int, b:Int) { // Unit 생략 가능.
        print(a+b)
    }
    fun sum4(a:Int, b:Int):Int { // 함수 안에 함수 선언 가능.
        var sum=0
        fun calSum() { // 지역 변수처럼 지역 함수라 생각하면 쉬움,
            for(i in a..b) {
                sum+=i
            }
        }
        calSum()
        return sum
    }
    fun sum5(a:Int, b:Int):Int = a+b // 단일 표현 함수
    fun sum6(a:Int, b:Int) = a+b // 반환형 생략 가능

}
