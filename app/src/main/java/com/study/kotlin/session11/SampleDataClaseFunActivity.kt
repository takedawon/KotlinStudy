package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleDataClaseFunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_data_clase_fun)
        val product = Product("prod1", 100)
        print(product.toString())
        // class toString()는 주소 출력
        // data class toString()은 객체의 데이터 출

        val user=User2("prod1",100)
        print(user.toString())

        val (name,age) = user // 변수를 두 개 선언한 것.

        //componentN 함수 주생성자 N번째 데이터 출

        print(user.component1()) // prod1 출력
        print(user.component2()) // 100 출력

        //copy() 함수

        val user2 = user.copy(name="prod2")

        //이름 그대로 객체를 복사해서 다른 객체를 만들어주는대 일부분의 데이터를 변경해서
        //다른 객체를 만들 때 유용하다.


    }
}

class Product(val name:String, val price:Int)
data class User2(val name:String, val age:Int)
