package com.practice.halfHour.classDefine

/**
  * Created by roeuihyun on 2016. 6. 14..
  * 메소드를 정의는 다음과 같이 진행한다.
  */
// ② 메소드를 가지는 클래스
class Person2(fname:String, lname:String){
  def greet = s"${lname}${fname}님 안녕하세요!" // public한 method
}