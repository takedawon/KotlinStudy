package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleTailrecActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_tailrec)
        recPrint(3)
        tailrecPrint(3)
        /*
        * tailrec 예약어를 사용하는 이유!
        * 1. 자바로 변환되어 실행될 때, 재귀함수가 일반 반복문으로 바뀜
        * 2. 자바에서 재귀함수를 사용할 때 StackOverFlow 에러가 많이 발생했는데,
        * tailrec 키워드를 사용하면 일반 반복문으로 바뀌기 때문에,
        * StackOverFlow 에러의 위험성에서 벗어날 수 있음.
        *
        * tailrec 예약어를 사용할 때 주의점!
        * 1. tailrec 재귀함수에서 자신을 다시 호추하는 구문은 함수의
        * 맨 마지막 줄에 작성해야한다. 그래서 꼬리 재귀함수라한다.
        * 2. 맨 마지막 줄에 연산식이 표함되면 tailrec 예약어를
        * 사용하는것이 무의미하다.
        * 3. ex) return n+sum(n-1) X
        *    ex) return sum(x-1) O
        * */
    }

    fun loopPrint(no:Int=1) {
        var count=1
        while(true) {
            println("loopPrint..")
            if(no==count)
                return
            else
                count++
        }
    }
    fun recPrint(no:Int=1, count:Int=1) {
        println("recPrint...")
        return if(no == count)
            return
        else
            recPrint(no-1,count)
    }
    tailrec fun tailrecPrint(no:Int = 1, count:Int=1) {
        println("tailrecPrint...")
        return if(no==count) return else tailrecPrint(no-1,count)
    }
}
