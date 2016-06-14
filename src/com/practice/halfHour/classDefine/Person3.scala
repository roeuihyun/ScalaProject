package com.practice.halfHour.classDefine

/**
  * Created by roeuihyun on 2016. 6. 14..
  * 필드를 선언하는 방법은 다음과 같다.
  */
// ③ public한 val(read only) 필드
class Person3(fname:String, lname:String){
  val fullName = s"${lname}${fname}" // public한 val(read only) 필드
  def greet = s"${fullName}님 안녕하세요!" // public한 method
}