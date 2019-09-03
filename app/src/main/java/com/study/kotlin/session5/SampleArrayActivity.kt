package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.study.kotlin.R

class SampleArrayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_array)

        var array = arrayOf(1,"kkang", true)
        array[0]=10
        array[2]="world"
        pr(array[0])
        pr(array[1])
        pr(array[2])

        pr(array.size)
        pr(array.get(0))
        pr(array.get(1))
        pr(array.get(2))

        var arrayInt = arrayOf<Int>(10,20,30)
        pr(arrayInt.get(0))

        var arrayInt2 = intArrayOf(1,2,3)
        var arrayDouble = doubleArrayOf(1.1,1.2,1.3)

        var array2=Array(3,{i->i*10})

        pr2(array2.get(0))
        pr2(array2.get(1))
        pr2(array2.get(2))

        var array3 = IntArray(3,{i->i*20})

        var array4 = arrayOfNulls<Any>(3)
        array4[0] = 10
        array4[1] = "hello"
        array4[2] = true

        var emptyArray = Array<String>(3,{""})
        emptyArray[0] = "hello"
        emptyArray[1] = "world"
        emptyArray[2] = "kkang"
    }
    fun pr(msg:Any) {
        Log.e("test1", msg.toString())
    }
    fun pr2(msg:Any) {
        Log.e("test2", msg.toString())
    }
}
