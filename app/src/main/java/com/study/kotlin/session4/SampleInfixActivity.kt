package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleInfixActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_infix)
        val obj = FunClass()
        obj.infixFun(10)
        obj infixFun 10 // 함수호출 중위표현식

        println(10.MyFun(10))
    }

    infix fun Int.MyFun(x:Int):Int {
        return x*x
    }
    class FunClass {
        infix fun infixFun(a:Int) {
            println("infixFun Call...")
        }
    }
    /*
    * infix(중위표현식)을 사용 할 수 있는 조건
    * 1. 매개변수가 한 가지 일 때
    * 2. 클래스 확장 함수(extension) 일 경우,
    * */
}
