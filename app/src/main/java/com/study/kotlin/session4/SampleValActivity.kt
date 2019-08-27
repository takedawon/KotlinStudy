package com.study.kotlin.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleValActivity : AppCompatActivity() {
    val data:Int=10
    val data1=20
    var data2=30
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_val)
        /*
        * val은 immutable(Read Only)
        * var은 mutable(변경가능한)
        * */
    }
}
