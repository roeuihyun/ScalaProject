package com.practice.scalaSchool

/**
  * Created by Administrator on 2016-06-11.
  * 때때로 타입 변수에 어떤 이름이 붙던 상관이 없는 경우가 있다
  */
object QuantificationClass {

  def count[A](l: List[A]) = l.size
  def count2(l: List[_]) = l.size
  def drop1(l: List[_]) = l.tail // tail : Returns this list without its first element.
  def hashcodes(l: Seq[_ <: AnyRef]) = l map (_.hashCode)

  def main(args: Array[String]) {

    println("count(List(1,2,3,4,5)) : " + count(List(1,2,3,4,5)))
    println("count2(List(1,2,3,4,5)) : " + count2(List(1,2,3,4,5)))
    println("drop1(List(1,2,3,4,5)) : " + drop1(List(1,2,3,4,5)))
    //primitive types are not implicitly converted to AnyRef.
    //println("hashcodes(Seq(1,2,3,4,5)) : " + hashcodes(Seq(1,2,3,4,5))) the result type of an implicit conversion must be more specific than AnyRef
    println("hashcodes(Seq(\"one\", \"two\", \"three\")) : " + hashcodes(Seq("one", "two", "three")) )

  }

}
