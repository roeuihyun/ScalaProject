package com.practice.halfHour.variableCalculation

/**
  * Created by Administrator on 2016-06-12.
  * 변수는 var로 상수는 val로 선언한다. 한 번에 여러 개의 변수를 선언하고 값을 대입할 수도 있다.
  */
object VariableConstant {

  def main(args: Array[String]): Unit = {
    var x = 1 + 2
    x = 3 * 4
    println("x : " + x )
    println("x.hashCode() : " + x.hashCode() )

    val y = 1 + 2
//    y = 3 * 4 // 이 줄은 상수에 값을 대입해서 에러가 나기 때문에 지워야 합니다.
    println("y : " + y )
    println("y.hashCode() : " + y.hashCode() )

    // 한 번에 여러개의 변수를 선언하면서 값을 대입할 수도 있습니다.
    var a, b, c = 5
    println("a : " + a )
    println("a : " + b )
    println("b : " + c )
  }

}
