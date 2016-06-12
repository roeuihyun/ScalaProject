package com.practice.halfHour.methodAndFunction

/**
  * Created by Administrator on 2016-06-12.
  * 스칼라에서 메소드는 다양한 형태로 정의할 수 있습니다.리턴값이 있는 메소드는 메소드를 정의하는 블럭{ }전에 =을 적어주어야 한다.
  * 그리고 리턴 키워드는 옵션이다. 적어주지 않으면 리턴타입은 리턴값에 의해 결정된다.
  */
object DefineMethod {

  // ① 일반적인 메소드
  def add(x:Int, y:Int):Int = {
    return x + y
  }

  // ② return을 생략한 메소드
  def addWithoutReturn(x:Int, y:Int) = { // x + y는 int이므로 return타입은 Int로 결정됩니다.
    x + y // return을 적어주지 않아도 마지막 값이 return값입니다.
  }

  // ③ 메소드가 한 줄일 경우 중괄호{}를 생략해도 됩니다.
  def addWithoutBlock(x:Int, y:Int) = x + y

  def main(args: Array[String]): Unit = {
    println(s"① ${add(1,2)}")
    println(s"② ${addWithoutReturn(1,2)}")
    println(s"③ ${addWithoutBlock(1,2)}")
  }

}
