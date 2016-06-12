package com.practice.halfHour.convenientScala

/**
  * Created by Administrator on 2016-06-12.
  * 문자열을 쉽게 다룰 수 있다.
  */
object StringsControl {

  def main(args: Array[String]): Unit = {
    // ① 뒤집기
    val reverse = "Scala".reverse
    println(s"① $reverse")

    // ② 첫글자를 대문자로
    val cap = "scala".capitalize
    println(s"② $cap")

    // ③ 7번 반복
    val multi = "Scala! " * 7 // * 7의 연산은 문자열의 경우 반복해서 제공해 준다.
    println(s"③ $multi")

    // ④ 정수로 변환
    val int = "123".toInt
    println(s"④ $int")

  }

}
