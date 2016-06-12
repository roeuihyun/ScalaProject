package com.practice.halfHour.controlStatements

/**
  * Created by Administrator on 2016-06-12.
  */
object LoopStatements {

  def main(args: Array[String]): Unit = {
    // ① while문
    var i, sum = 0
    while ( i < 10) {
      sum += i
      i+=1
    }
    println(s"sum① : $sum")

    // ② for문
    sum = 0
    for ( i <- 0 until 10) {
      sum += i
    }
    println(s"sum② : $sum")

    //③ 가장 스칼라스럽게 합을 구하는 방법
    sum = (0 until 10).sum
    println(s"sum③ : $sum")
  }

}
