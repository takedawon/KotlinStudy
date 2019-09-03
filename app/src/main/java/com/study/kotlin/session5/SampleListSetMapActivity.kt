package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleListSetMapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list_set_map)
        val immutableList : List<String> = listOf("hello","world")

        val mutableList : MutableList<String> = mutableListOf("Hello")
        mutableList.add("world")
        mutableList.set(1,"haha")

        val arrayList : ArrayList<String> = ArrayList()

        arrayList.add("hello")
        arrayList.add("kkang")
        arrayList.set(1,"world")

        val immutableMap1=mapOf<String,String>(Pair("One","Two"),Pair("Three","Four"))
        val immutableMap2=mapOf<String,String>("one" to "two", "three" to "four")

        val mutableMap = mutableMapOf<String,String>()
        mutableMap.put("one","hello")
        mutableMap.put("two","map")

        val immutableSet=setOf<String>("Hello","world")

        val mutableSet = mutableSetOf<String>()

        mutableSet.add("Hello")
        mutableSet.add("set")
    }
}
