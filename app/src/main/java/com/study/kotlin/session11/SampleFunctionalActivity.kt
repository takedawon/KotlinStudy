package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R
import java.io.File
import java.io.FileWriter
import java.lang.Exception

class SampleFunctionalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_functional)

        // 순수 함수가 아닌 예#1
        fun some(a: Int): Int {
            return (Math.random() * a).toInt()
        }
        //매개변수로 값을 전달받고 그 값을 이용하여 랜덤 값을 발생한 후 반환한다.
        //하지만 순수함수는 같은 매개변수 값일 때 매번 같은 값을 반환해야 한다. 랜덤값을 반환하니
        //이 함수는 순수 함수가 아니다.

        // 순수 함수가 아닌 예#2
        fun some2(a: String): Boolean {
            try {
                val file = File("a.txt")
                val out = FileWriter(file)
                out.write(a)
                out.flush()
                return true
            } catch (e: Exception) {
                return false
            }
        }
        //위 함수는 매개변수로 문자열을 받고, 그 값을 파일에 저장한다. 하지만 순수함수에서는
        //부수효과(Side Effect)가 발생하면 안되는데 위 함수는 파일 입출력이 발생하기 때문에 순수함수가 x


        //순수 함수의 예
        fun some2(a: Int, b: Int): Int {
            return a + b
        }
        // some2 함수는 매개변수가 있고, 반환값이 있으며, 같은 인자를 전달 시 항상 같은 값을 반환하고,
        //함수 내에서 부수효과가 발생하지 않고, 함수 외부에의 변수값을 변경하지도 않고, 함수내의
        //입출력이 발생하지 않으니, 위 함수는 순수함수라고 이야기 할 수 있다.


        //순수 함수가 아닌 예#3
        fun some3(): Int {
            return 10
        }

        /**
         * some3 함수는 부수효과가 발생하지 않고, 매번 같은 결과값을 반환하지만, 매개변수가 없으므로
         * 일반 상수를 사용하는 것과 별반 다르지 않으며, 함수로서 의미가 없다. 결과적으로,
         * 매개변수가 없는 함수는 순수함수로서 의미가 없다.
         * */

        //순수 함수가 아닌 예#4
        fun some4(a: Int, b: Int) {
            val result = a + b
        }

        /**
         * 위의 함수는 매개변수가 있고, 부수효과도 없으며, 외부의 데이터를 변경하거나, 입출력이 없다.
         * 그러나, 반환값이 없다. 함수형 프로그래밍은 함수를 변수처럼 다루고자 하는 개념인데,
         * 반환값이 없으면 실행 결과값이 없다는 의미다. 결국 의미없는 순수 함수가 된다.
         * */


        fun superFun() {
            val superData = "Hello"
            fun subFun1() {
                println("subFun().. superdata : $superData")
            }

            fun subFun2(a: Int, b: Int): Int {
                subFun1()
                return a + b
            }

            class SubClass {
                fun classFun() {
                    println("classFun().. superData : $superData")
                }
            }
            subFun1()
            SubClass().classFun()
        }
        /**
         * 코틀린은 함수 내에 함수나 클래스를 선언 할 수 있음
         * */

        // 변수처럼 이용되는 함수
        val dataVal=10
        val funVal={ x:Int ->
            println("hello world")
            x*10
        }
        funVal(10)//100 출력
        /**
         * 일반적으로 변수에 데이터를 대입 해야 하지만 funVal변수에는 함수를 대입했다.
         * 이때 사용한 함수의 형태를 '람다 함수' 라고 한다. 이처럼 람다식으로 표현한 함수는
         * 변수에 대입할 수 있으며 이후 funVal는 함수변수가 된다.
         * */

        fun someFun() {
           println("i am some Function")
        }

        val funVal2 = ::someFun
        funVal2()
        /**
         * 이 함수를 변수에 대입할 때 val funVal2 = someFun 코드라면 컴파일 에러가 발생한다.
         * 대신 112번 줄처럼 사용한다면 가능하다. 이처럼 함수 참조 연산자 :: 를 이용하면 함수를
         * 변수에 대입할 수 있다.
         * */

    }
}
