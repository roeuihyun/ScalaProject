package com.practice.halfHour.controlStatements

/**
  * Created by roeuihyun on 2016. 6. 13..
  * for 문 안에 if 조건을 ;(세미콜론)을 구분자로 조건을 넣어 출력할 수 있다.
  * 조건은 제외조건, 필수 적용 조건 다 가능하다.
  */
object ForMixIfStatements {

  def main(args: Array[String]): Unit = {
    for( i <- 1 to 20 if i%3 == 0; if i != 9){
      println(i)
    }
  }

}
