package com.practice.halfHour.collection

import scala.collection.mutable

/**
  * Created by roeuihyun on 2016. 6. 14..
  * 변경할 수 없는(immutable) Collection이 var로 선언된 경우에 Collection에 +=연산자나 -+연산자를 사용할 수 있다.
  * 하지만 Collection 자체가 변경할 수 없는 형태이므로 이때는 변경사항을 반영한 새로운 Collection이 만들어져서 var로 선언된 변수에 저장된다.
  * 변경할 수 있는(mutable) Collection의 경우에는 +=나 -=연산자가 collection의 메소드로 동작한다.
  * 변경할 필요가 있다면 반드시 Mutable로 생성하는게 좋다.
  */
object ImmutableCollection {

  def main(args: Array[String]): Unit = {
    // ① 변경할 수 없는 Collection이 var로 선언된 경우
    var immutableSet = Set(1, 2, 3)
    immutableSet += 4
    // 위의 코드는 새로운 Set을 만들어서 immutableSet에 저장하는 아래 코드와 같음
    immutableSet = immutableSet + 4
    println(s"① $immutableSet")

    // ② 변경할 수 있는 Collection이라면 추가하는 Method를 호출하는것과 같음
    val mutableSet = mutable.Set(1, 2, 3)
    mutableSet += 4
    // 위의 코드는 mutableSet 자체의 메소드(+=이라는 메소드)를 호출하는 아래 코드와 같음
    mutableSet.+=(4)
    println(s"② $mutableSet")
  }

}
