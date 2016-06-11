package com.practice.scalaSchool

/**
  * Created by Administrator on 2016-06-11.
  */
object ListTest {

  var list1 = List(1,2,3,4)
  var list2 = List('a','b')
  var list3 = List(5,6)
  var list4 = list1 ::: list3 // ++ 와 ::: 차이가 있다.
//  var list5:AnyVal = List()

  def main(args: Array[String]) {
    println(list1.hashCode())
    println("list1 : " + list1)
    println("list2 : " + list2)
    println("list3 : " + list3)
    println("list4 : " + list4)

    println(list1.hashCode())

//     TypeCasting
//    list5 = list4 ++ list2 // 타입이 다르다 List[Int]와 List[AnyVal]

  }
}
