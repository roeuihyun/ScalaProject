package com.practice.halfHour.controlStatements

/**
  * Created by roeuihyun on 2016. 6. 13..
  * 위의 결과와 아래의 결과는 동일하다.
  * 중첩된 for문 대신 ; 을 사용하면 반복을 피할 수 있다.
  */
object LoopedForStatements {

  def main(args: Array[String]): Unit = {
    for( a<- 1 to 3){
      for( b <- 10 to 12){
        println(a,b)
      }
    }

    println("중첩된 for문 대신 아래와 같이 쓸 수 있다.")
    for( a <- 1 to 3; b <- 10 to 12){
      println(a,b)
    }
  }

}
