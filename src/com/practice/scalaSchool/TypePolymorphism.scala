package com.practice.scalaSchool

/**
  * Created by roeuihyun on 2016. 6. 9..
  */
object TypePolymorphism {

  // 타입 시스템은 프로그램 각 부분이 만들어낼 수 있는 값의 종류를 나눔으로써 그 프로그램이 특정 오류 상황을 발생시키지 않는다는 것을 자동으로 검증해주기 위한 문법적 검증 방법
  // f: R -> N  라는 것은 f가 실수(`R`)에 대해 자연수(`N`)를 대응시키는 함수 라고 칭한다.

  val res5 = 2 :: 1 :: "bar" :: "foo" :: Nil //tuple일거라 생각하지만 List?...
  def drop1[A](l: List[A]) = l.tail
  def toList[A](a: A) = List(a)
//  def foo[A, B](f: A => List[A], b: B) = f(b) Mistype Match
//  def foo[A](f: A => List[A], i: Int) = f(i) Mistype Match
  def id[T](x: T) = x

  def main(args: Array[String]): Unit = {

    println("---------------------------------------------------------------------------------------------------------")
    println("res5 : " + res5 )
    println("res5.head : " + res5.head )

    println("---------------------------------------------------------------------------------------------------------")
    println("drop1(List(1,2,3)) : " + drop1(List(1,2,3)) )

    println("---------------------------------------------------------------------------------------------------------")
    println("toList(List(1,2,3)) : " + toList(List(1,2,3)) )

    println("---------------------------------------------------------------------------------------------------------")
    val x = id(322)
    println("x : " + x )

    val y = id("hey")
    println("y : " + y )

    val z = id(Array(1,2,3,4))
    println("z : " + z )

  }

}
