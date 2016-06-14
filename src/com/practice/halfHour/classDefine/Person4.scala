package com.practice.halfHour.classDefine

/**
  * Created by roeuihyun on 2016. 6. 14..
  * val은 getter만 var은 getter, setter가 자동으로 생성된다.
  */
/* ④
 * val로 선언된 fname는 getter가 자동으로 생성되고
 * var로 선언된 lname은 getter와 setter가 자동으로 생성된다. */
class Person4(val fname:String, var lname:String)