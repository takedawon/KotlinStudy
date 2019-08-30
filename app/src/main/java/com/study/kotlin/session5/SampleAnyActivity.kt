package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.study.kotlin.R

class SampleAnyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_any)
        pr(cases(1))
        //pr(cases(10))
    }

    fun getLength(obj:Any):Int {
        if(obj is String) { // is 키워드는 타입을 점검해준다
            return obj.length
        }
        return 0
    }

    fun cases(obj: Any):String {
        when(obj) {
            1-> return "One"
            "Hello" -> return "Greeting"
            "is Long" -> return "Long"
            !is String -> return "Not a String"
            else -> return "Unknown"
        }
    }
    fun pr(msg:Any) {
        Toast.makeText(this,msg.toString(),Toast.LENGTH_SHORT).show()
    }
}
