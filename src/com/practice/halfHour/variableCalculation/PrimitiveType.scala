package com.practice.halfHour.variableCalculation

/**
  * Created by Administrator on 2016-06-12.
  * 스칼라에서 1(Int 리터럴)과 같은 원시타입(Primitive)은 객체(Object)로 취급된다.
  * 자바만 하다가 보면 어색하지만 .+ 연산이 가능하다.
  * 단 연산의 대상이 되는 객체는 반드시 ()로 감싸줘야한다.
  * 이와 같은 표현 방식은 연산자 표기방식(Operator notation) 또는 infix 표기방식이라 부른다.
  */
object PrimitiveType {

  def main(args: Array[String]): Unit = {

    println( 1 + 2 )
    println( (1).+(2) )
    println( 1.+(2) )

  }

}
