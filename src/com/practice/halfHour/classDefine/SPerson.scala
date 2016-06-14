package com.practice.halfHour.classDefine

/**
  * Created by roeuihyun on 2016. 6. 14..
  */
// 스칼라에서는 이렇게 간단하게 만들 수 있습니다.
import beans._
class SPerson(@BeanProperty var name:String)
// @BeanProperty는 필수가 아닙니다. 자바 스타일의 getter와 setter가 필요한 경우에만 사용하세요.