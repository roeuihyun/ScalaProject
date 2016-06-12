package com.practice.halfHour.tuple

/**
  * Created by Administrator on 2016-06-12.
  * 튜플의 값에 접근하려면 ._1, ._2와 같은 메소드를 사용하면 된다.
  */
object Tuple {

  def main(args: Array[String]): Unit = {
    val t1 = new Tuple3(1, "hello", true)
    val t2 = (1, "hello", true)

    println("t1 : " + t1)
    println("t2 : " + t2)

    val numbers = (1,2,3,4) //var 도 가능하지만 main method 안에 있으므로 var를 추천한다.
    val sum = numbers._1 + numbers._2 + numbers._3 + numbers._4
    println("numbers : " + numbers)
    println("sum : " + sum)

  }

}
