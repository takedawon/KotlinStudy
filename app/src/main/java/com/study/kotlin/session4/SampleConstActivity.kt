package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

const val myConst:Int=10
/*
* const 상수의 제약사항
* 1. var 키워드 사용 안됨.
* 2. 클래스, 함수 내부 선언 안됨.
* 3. 변수를 최상위로 선언하거나,
* object로 선언한 클래스에서만 사용가능
* */
var myBool=false
val myVal:String="hello"
get() {
    if(myBool)
        return field
    else
        return field.toUpperCase()
}

class SampleConstActivity : AppCompatActivity() {

    //const val myConst:Int=10
    //const var myConst2:Int=10 에러
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_const)
    //const val myConst3:Int=10 에러
        println(myVal)
        myBool=true
        print(myVal)
    }
}
