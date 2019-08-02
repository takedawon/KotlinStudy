package com.study.kotlin.session3

import com.study.kotlin.session3.sub.SampleFileConfigFour
import java.util.*

fun calSum2() {
    for(i in 1..10) {
        sum += i
    }
}

class SampleFileConfigThree {
    val name ="kkang"
    fun sayHello() {
        val date = Date()
        println("date : " + date)
        println("Hello!! " + name)
    }
}

fun main(args:Array<String>) {
    calSum2()
    println(sum)
    SampleFileConfigThree().sayHello()
    val four = SampleFileConfigFour()
}