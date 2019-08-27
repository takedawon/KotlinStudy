package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

/*
 * 클래스 외부에 초기화 하지않고 변수만 선언시 에러
val topData1:Int
val topData2:Int
*/
class SampleVar2Activity : AppCompatActivity() {
    /*
     * 클래스 내부 또한 초기화하지 않고 변수만 선언시 에러
    val objData1:String
    val objData2:String
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_var2)
        val localData1:Int
        val localData2:String
        // 지역 변수는 에러가 뜨지 않지만, 초기화를 해야 사용할 수 있다.
        // 자동으로 초기값이 대입되지 않는다.

        /*
        * println(localData1) 출력시 에러
        * */

        localData2="hello"
        println(localData2)
    }
}
