package com.study.kotlin.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.study.kotlin.R

class SampleIteratorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_iterator)

        val list1 = listOf<String>("hello","list")
        val iterator1 = list1.iterator()
        while(iterator1.hasNext()) {
            Log.e("iterator",iterator1.next())
        }

        val map = mapOf<String,String>("one" to "hello","two" to "map")
        val iterator2 : Iterator<Map.Entry<String,String>> = map.iterator()
        while(iterator2.hasNext()) {
            val entry=iterator2.next()
            Log.e("iterator",entry.key)
            Log.e("iterator",entry.value)
        }

        val set=setOf<String>("Hello","set")
        val iterator3 = set.iterator()
        while(iterator3.hasNext()) {
            Log.e("iterator",iterator3.next())
        }

        val array=arrayOf("hello","world")
        val iterator4 = array.iterator()
        while(iterator4.hasNext()) {
            Log.e("iterator",iterator4.next())
        }


    }
}
