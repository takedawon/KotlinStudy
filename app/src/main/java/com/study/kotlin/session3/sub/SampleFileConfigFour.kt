package com.study.kotlin.session3.some_package

import android.os.health.SystemHealthManager
import java.util.Date
import java.sql.Date as SqlDate

var fourNum = 10
fun four() {

}
fun main(args: Array<String>) {
    val date = Date()
    val date2 = SqlDate(System.currentTimeMillis())

    println("java.util.Date() : " + date)
    println("java.sql.Date() : " + date2)
}