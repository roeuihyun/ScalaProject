package com.practice.halfHour.variableCalculation

/**
  * Created by Administrator on 2016-06-12.
  * 스칼라는 println, printf를 쓸 수 있다.
  */
object PrintVariable {

  def main(args: Array[String]): Unit = {
    var x = 10
    var y = 1

    // ① println
    println("① " + x + " is bigger than " + y)

    // ② 문자열 앞에 s를 쓰면 $를 쓰고 변수이름을 바로 쓸 수 있습니다.
    println(s"② $x is bigger than $y")

    // ③ 수식을 입력하고 싶으면 ${ }사이에 식을 넣으면 됩니다.
    println(s"③ $x + $y = ${ x + y }")

    // ④ printf도 사용 가능합니다.
    //java.lang.*은 자동으로 import됩니다.
    //java.lang.Math도 포함입니다.
    printf("④ Pi is %f",Math.PI)
  }

}
