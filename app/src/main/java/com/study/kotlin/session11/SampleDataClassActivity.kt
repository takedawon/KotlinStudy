package com.study.kotlin.session11

//객체지향 언어에선 흔히 VO로 불린다. Value-Object
//코틀린에선 이런 클래스들을 조금 더 편하게 이용하기 위해 데이터 클래스를 제공한다.

data class User(val name:String, var age:Int)
class Person(val name:String, var age:Int)

// 주 생성자를 선언해야 하며 주 생성자의 매개변수는 최소 하나 이상이어야 한다.
// 모든 주 생성자의 매개변수는 var 혹은 val로 선언해야 한다.
// 데이터 클래스 abstract, open, sealed, inner 등의 예약어를 추가할 수 없다.

// 데이터 클래스가 유용한 이유는 다양한 기능의 함수를 제공하기 때문.
// 개발자가 클래스 내에 선언하지 않아도 자동으로 다음의 함수를 제공함
// equals() / hashCode()
// toString()
// componentN()
// copy()

// equals() 는 객체의 데이터가 같은지를 비교할 때 사용.

class SampleDataClassActivity {
    constructor() {
        val user = User("lanic", 25)
        val user2 = User("lanic", 25)
        val person = Person("haha", 20)
        val person2 = Person("haha", 20)

        dataPrint(user, user2) // true
        dataPrint(person,person2) // false

        //원래 class의 equals() 함수 같은 경우는 객체를 비교하지만,
        //data class의 equals() 는 객체의 데이터를 비교한다.
        //주 생성자의 매개변수가 아닐 경우 값을 비교하지 않는다.
    }

    fun dataPrint(data:Any, data2:Any) {
        print(data.equals(data2))
    }
    // class

}