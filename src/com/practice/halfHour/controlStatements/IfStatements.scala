package com.practice.halfHour.controlStatements

/**
  * Created by roeuihyun on 2016. 6. 13..
  * 조건문에 관련된 문법이다.
  * 스칼라에서는 if 가 명령어가 아니고 값을 돌려줄 수 있는 식이다.(if문은 수식(Expression)이다)
  * val breakfast = likeEggs ? "계란후라이" : "사과" 와 같은 삼항 연산자는 에러를 낸다
  */
object IfStatements {

  def main(args: Array[String]): Unit = {
    if (true)
      println("한 줄은 {괄호}를 생략할 수 있습니다.")

    if (1 + 1 == 2) {
      println("여러 줄은")
      println("{괄호}가 필요합니다.")
    } else {
      println("컴퓨터가 미쳤나봐요.")
      println("else 논리값으로 들어갈 수 없다")
    }

    val likeEggs = false
    // 삼항 연산자대신 이렇게 쓸 수 있습니다.
    val breakfast =
      if (likeEggs) "계란후라이"
      else "사과"
//    다음과 같은 3항 연산자는 사용할 수 없다
//    val breakfast = likeEggs ? "계란후라이" : "사과"


      println(s"아침으로 ${breakfast}를 먹어요")

  }

}
