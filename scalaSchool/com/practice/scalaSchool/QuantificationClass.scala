package com.practice.scalaSchool

/**
  * Created by Administrator on 2016-06-11.
  * 때때로 타입 변수에 어떤 이름이 붙던 상관이 없는 경우가 있다
  */
object QuantificationClass {

  def count[A](l: List[A]) = l.size
  def count2(l: List[_]) = l.size

  def main(args: Array[String]) {
    println("count(List(1,2,3,4,5)) : " + count(List(1,2,3,4,5)))
    println("count2(List(1,2,3,4,5)) : " + count2(List(1,2,3,4,5)))
  }

}
