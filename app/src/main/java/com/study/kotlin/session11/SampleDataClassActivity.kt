package com.study.kotlin.session11

//객체지향 언어에선 흔히 VO로 불린다. Value-Object
//코틀린에선 이런 클래스들을 조금 더 편하게 이용하기 위해 데이터 클래스를 제공한다.

data class User(val name:String, var age:Int)

// 주 생성자를 선언해야 하며 주 생성자의 매개변수는 최소 하나 이상이어야 한다.
// 모든 주 생성자의 매개변수는 var 혹은 val로 선언해야 한다.
// 데이터 클래스 abstract, open, sealed, inner 등의 예약어를 추가할 수 없다.

