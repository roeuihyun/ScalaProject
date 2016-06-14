package com.practice.halfHour.collection

import scala.collection.mutable

/**
  * Created by roeuihyun on 2016. 6. 14..
  * 스칼라는 변경할 수 없는(immutable) Collection을 사용하는것을 권장한다.
  * 그래서 기본 Collection이 immutable이다.
  * 하지만 꼭 필요할 경우 변경할 수 있는(mutable) collection을 사용할 수 있다.
  * ArrayBuffer는 자바에서 배열로 구현되는 java.util.ArrayList와 유사하다.
  * ListBuffer는 List처럼 Linked List로 구현된다.
  * mutable한 Collection을 사용할때는 앞에 mutable을 붙여서 사용하면 된다.
  * (mutable.ArrayBuffer, mutable.ListBuffer, mutable.Set, mutable.Map)
  */
object MutableCollection {

  def main(args: Array[String]): Unit = {
    // ① 배열로 구현되는 ArrayBuffer
    val arrayBuffer = mutable.ArrayBuffer(1, 2, 3)
    arrayBuffer += 4
    arrayBuffer -= 1
    arrayBuffer ++= List(5, 6, 7)
    println(s"① $arrayBuffer")

    // ② Linked list로 구현되는 ListBuffer
    val listBuffer = mutable.ListBuffer("a", "b", "c")
    println(s"② $listBuffer")

    // ③ Mutable Set
    val hashSet = mutable.Set(0.1, 0.2, 0.3)
    hashSet ++= mutable.Set(5)
    println(s"③ $hashSet")

    // ④ Mutable Map
    val hashMap = mutable.Map("one" -> 1, "two" -> 2)
    hashMap ++= Map("five" -> 5, "six" -> 6)
    println(s"④ $hashMap")
  }

}
