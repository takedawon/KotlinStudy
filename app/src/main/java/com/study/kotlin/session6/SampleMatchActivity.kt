package com.study.kotlin.session6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleMatchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_match)

        //일치 연산자
        val user1 = User("lanic")
        val user2 = User("lanic")
        var user3 = user1

        println("user1 == user2 is ${user1 == user2}") // false
        println("user1 === user2 is ${user1 == user2}") // false
        println("user1 == user2 is ${user1 == user3}") // true
        println("user1 === user2 is ${user1 === user3}") // true

        // 결과적으로 ==과 ===의 결과값은 다를것이 없다. 두 연산자 모두 객체를 비교한다.
        // 그러나 기초 데이터 타입에서는 ==,=== 연살 결과에 차이가 있다. ?의 여부에 따라 차이가있다.


    }
}

data class User(val name:String)

