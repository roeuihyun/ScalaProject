package com.practice.halfHour.controlStatements

/**
  * Created by roeuihyun on 2016. 6. 13..
  * switch문과 다른 점은 다음과 같다.
  * match라는 키워드가 변수 뒤에 온다.
  * break가 필요 없다.(선택된 case의 코드가 실행된 다음 아래의 case가 이어서 실행되지 않는다)
  */
object MatchStatements {

  def main(args: Array[String]): Unit = {
    val selection = "하나"
    selection match {
      case "하나" => println("하나를 선택했습니다.")
      case "둘" => println("둘을 선택했습니다.")
      case _ => println("다른 값")
    }
  }

}
