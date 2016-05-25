package com.practice.grammar

/**
  * Created by roeuihyun on 2016. 5. 24..
  */
object CalculatorMain {

  val calc = new Calculator("HP")

  def main(args: Array[String]) {
    println(calc)
    println(calc.color)
    println("------------------------------------------------------------------------------------------")
    println(calc.acc)
    println(calc.minc)
    println("------------------------------------------------------------------------------------------")
    println(calc.acc)
    println(calc.finc)
    println("------------------------------------------------------------------------------------------")
    println(calc.acc)
    println("------------------------------------------------------------------------------------------")
  }

}
