package com.study.kotlin.session6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R
import java.util.Arrays.asList

class SampleDeploymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_deployment)

        val array1 = arrayOf(10,20,30)

        val list1 = asList(1,2, array1[0], array1[1], array1[2],100,200)
        list1.forEach{println(it)}

        val list2 = asList(1,2,*array1,100,200)
        list2.forEach{println(it)}

        val array3 = arrayOf<String>("hello","world")
        some(*array3)

        val list3 = listOf<String>("a","b")
        some(*list3.toTypedArray())
    }

    fun some(vararg a:String) {
        val iterator = a.iterator()
        while(iterator.hasNext()) {
            println(iterator.next())
        }
    }
}
