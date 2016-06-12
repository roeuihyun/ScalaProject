package com.practice.scalaSchool

/**
  * Created by Administrator on 2016-06-12.
  * “A <% Int”의 뜻은 A 를 Int 로 “볼 수 있어야만” 한다는 뜻
  */
class Container [A <% Int] {

  def addIt(x: A) = 123 + x

}