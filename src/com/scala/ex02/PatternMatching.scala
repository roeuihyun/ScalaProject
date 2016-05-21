package com.scala.ex02

object PatternMatching {

  val times1 = 1

  times1 match {
    case 1 => "one"
    case 2 => "two"
    case _ => "some other number" //_는 와일드카드이다. 즉, 모든 경우를 처리한다.
  }

  val times2Val = 2

  def times2 = times2Val match {
    case 1 => "one"
    case 2 => "two"
    case _ => "some other number"
  }

  def times3(param :String ): String =  param match {
      case "1" => "one"
      case "2" => "two"
      case _ => "some other number"
  }

}