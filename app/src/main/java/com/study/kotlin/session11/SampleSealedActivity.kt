package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleSealedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_sealed)

        val Shape1:Shape = Shape.Circle(10.0)
        val Shape2:Shape = Triangle(10,10)
    }
}

sealed class Shape {
    class Circle(val radius:Double) : Shape()
    class Rect(val width:Int,val height:Int) : Shape()
}

class Triangle(val bottom:Int, val height:Int) : Shape()


//Sealed Class 를 열거 상수 대신 사용하는 이유는 두 개 전부, 내부에 열거된 데이터를 사용하는 건 맞지만,
//Enum Class는 주 생성자에 선언된 프로퍼티를 전부 상속받기 때문에 객체별로 데이터 구성을 다르게 할 수 없고,
//이를 해결하고자 Sealed Class를 제공한다. (데이터를 서브 클래스별로 다양하게 구성할 수 있음.)

//일반 클래스와 실드 클래스의 차이점 이라고 한다면, 일반 클래스의 부모클래스는 객체 생성이 가능하다는 점,
//실드 클래스의 부모클래스는 객체 생성이 불가능하다는 점이다.

//Sealed는 abstract를 내장하는 개념이며. abstract와는 다르게 private가 강제되어 있다.




