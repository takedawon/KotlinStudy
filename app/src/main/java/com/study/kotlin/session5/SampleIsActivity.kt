package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleIsActivity : AppCompatActivity() {


    var a1:Int=10
    //var a2:Double = a1 코틀린에선 자동 형변환을 제공하지 않는다.
    var a2:Double = a1.toDouble() // 기초타입 캐스팅은 toXXX()함수로 명시해줘야한다.

    val l = 1L+3 // LONG + INT = > LONG 형변환이 자동으로 이뤄질때는 값의 형 변환일 때

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_is)
    }
    fun getStringLength(obj:Any):Int? {
        //val strData:String=obj 에러발생!
        if(obj is String) { // is연산자로 타입을 확인해서 맞으면 명시적으로 변형하지않아도 스마트 캐스팅된다.
            return obj.length
        }
        return null
    }

    fun getStringLength2(obj:Any):Int? {
        if(obj !is String) { // String 타입이 아니라면,
            return null
        }
        return obj.length
    }
}
