package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R
import com.study.kotlin.session11.Shape
import com.study.kotlin.session11.Triangle
import com.study.kotlin.session4.myVal

class SampleAny2Activity : AppCompatActivity() {

    val myVall1:Any = 10
    val myVall2:Any? = myVall1

    val myVall3:Any?=10
    //val myVall4:Any=myVal3 Any타입에 Any? 프로퍼티를 대입할 수 없다.
    val myVall5:Any=myVall3 as Any // as 키워드로 Any 로 형 변환하여 대입하였다.

    val myIntt1:Int = 10
    val myIntt2:Int? = myIntt1

    val myIntt3:Int? = 10
    //val myIntt4:Int = myIntt3 14번줄과 마찬가지로 Int타입에 Int? 프로퍼티를 대입할 수 없다.ㅣ
    val myIntt5:Int = myIntt3 as Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_any2)
        val test2: Shape = Shape.Circle(10.0)
    }

}

//class SealedTest:Shape() 다른 클래스에서 Sealed Class 선언시 오류발생
