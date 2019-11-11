package com.study.kotlin.session11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.kotlin.R

class SampleEnumFirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_enum_first)

        val direction2 = Direction2.NORTH

        println("${direction2.name}...${direction2.ordinal}")

        val directions:Array<Direction2> = Direction2.values()
        directions.forEach { t->println(t.name) }

        val directions2 = Direction2.valueOf("WEST")
        println("${directions2.name}...${directions2.ordinal}")


        val direction4 = Direction3.NORTH
        println(Direction3.NORTH.no)


        val direction5 = Direction4.NORTH
        print("no:${direction5.no}, ${direction5.str}")

        direction5.no = 10

        print("no:${direction5.no}, ${direction5.str}")

        val test:Shape = Triangle(10,10)
    }
}

enum class Direction2 {
    NORTH,SOUTH,WEST,EAST
}

enum class Direction3(val no:Int) {
    NORTH(0),SOUTH(1),WEST(2),EAST(3)
}

enum class Direction4(var no:Int, val str:String) {
    NORTH(0,"north"), SOUTH(1,"south"), WEST(2,"west"), EAST(3,"east")
}
