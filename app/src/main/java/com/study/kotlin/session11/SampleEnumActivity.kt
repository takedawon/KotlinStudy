package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleEnumActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_enum)

        var direction = Direction.NORTH
        print(direction.data1)
        direction.myFun()
    }
}

enum class Direction {
    NORTH { //익명 클래
        override val data1:Int = 10
        override fun myFun() {
            print("north myFun.....")
        }
    },
    SOUTH {
        override val data1:Int = 20
        override fun myFun() {
            print("south myFun.....")
        }
    };

    abstract val data1:Int
    abstract fun myFun()
}
