package com.practice.halfHour.methodAndFunction

/**
  * Created by Administrator on 2016-06-12.
  *  이 함수의 타입은 하나의 Int형 매개변수를 받아 Int형으로 그 제곱을 리턴하는 Int => Int입니다.
  *  (x: Int) => x * x
  *  이 함수의 타입은 두개의 Int형 매개변수를 받아 그 합을 Int를 리턴하는 (Int, Int) => Int입니다.
  *  (x: Int, y: Int) => x + y
  */
object AnonymousFunction {

  // 매개변수로 받은 익명함수에 1과 2를 넣어서 실행하는 메소드
  def doWithOneAndTwo(f: (Int, Int) => Int) = {
    f(1, 2) //return은 생략되었지만, f(1, 2)의 결과가 return (return statment를 사용하면 error가 나온다.)
  }

  // ① 메소드를 정의하는 방식
  def add1(x:Int, y:Int) = x + y

  // ② 익명함수
  val add2 = (x:Int, y:Int) => x + y

  // ③ 익명함수를 정의하는 다른 방식
  val add3:(Int,Int)=>Int = _ + _

  // ④ 익명함수를 정의하는 또다른 방식(잘 사용 안함)
  val add4 = (_ + _):(Int,Int)=>Int

  def main(args: Array[String]): Unit = {
    // ① 명시적으로 타입을 선언하는 익명함수
    val call1 = doWithOneAndTwo((x: Int, y: Int) => x + y)

    // ② 코드4번째 줄에서 익명함수의 매개변수 타입(Int, Int)을 이미 정했기 때문에 생략
    val call2 = doWithOneAndTwo((x, y) => x + y)

    // ③ 이렇게 요약할 수도 있음
    val call3 = doWithOneAndTwo(_ + _) // 매개변수의 순서대로 _에 대입됨

    println("call1 : " + call1)
    println("call2 : " + call2)
    println("call3 : " + call3)

    // 모두 두 숫자를 더해주는 역할을 하므로 같은 결과를 출력
    println(s"add1① ${add1(42,13)}")
    println(s"add2② ${add2(42,13)}")
    println(s"add3③ ${add3(42,13)}")
    println(s"add4④ ${add4(42,13)}")
  }

}
