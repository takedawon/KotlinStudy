package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleNullActivity : AppCompatActivity() {

    //val nonNullData:String=null //에러
    val nullableData1:String?=null
    var nullableData2:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_null)

        //nullableData1="hello" 위에서 이미 null로 초기화 했고,
        // 읽기 전용 변수이기 때문에 에러가 발생함.
        nullableData2="hello"
    }
}
