package com.practice.halfHour.collection

import java.awt.print.Printable

/**
  * Created by roeuihyun on 2016. 6. 14..
  * Array, List, Set, Map의 구성요소는 어떤 타입이든 사용할 수 있지만, 최종 타입은 공통으로 상속받는 타입 중 최상위 타입으로 결정된다.
  * Any를 모두 상속받기에 Plant라는 클래스를 새로 생성해서 넣어도 상위 객체를 Any로 지정하면 정상적으로 적용된다.
  */
object SignificantCollection {

  class Plant()
  class Animal()
  class Dog() extends Animal()

  def main(args: Array[String]): Unit = {
    // Animal과 Dog이 공통으로 상속받는 최상위 타입은 Animal이므로 아래 코드는 정상 실행
    val array:Array[Animal] = Array(new Animal(), new Dog())
    val array2:Array[Any] = Array(new Animal(), new Dog(),new Plant())
    // val wrongArray:Array[Dog] = Array(new Animal(), new Dog()) 올바르지 않은 타입

    // List도 같은 원리로 동작(Animal이 List의 element의 타입)
    val list:List[Animal] = List(new Animal(), new Dog())
    val list2:List[Any] = List(new Animal(), new Dog(),new Plant())

    // Set도 같은 원리로 동작(Animal이 Set의 element의 타입)
    val set:Set[Animal] = Set(new Animal(), new Dog())
    val set2:Set[Any] = Set(new Animal(), new Dog(),new Plant())

    // Map도 같은 원리로 동작
    val map:Map[String, Animal] = Map("Animal" -> new Animal(), "Dog" -> new Dog())
    val map2:Map[String, Any] = Map("Animal" -> new Animal(), "Dog" -> new Dog(), "Plant" -> new Plant())

    println(s"1.1 : ${array}")
    println(s"1.2 : ${array2}")
    println(s"2.1 : ${list}")
    println(s"2.2 : ${list2}")
    println(s"3.1 : ${set}")
    println(s"3.2 : ${set2}")
    println(s"4.1 : ${map}")
    println(s"4.2 : ${map2}")

  }

}
