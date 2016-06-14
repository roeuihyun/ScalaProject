package com.practice.scalaSchool

/**
  * Created by roeuihyun on 2016. 6. 12..
  * If you get errors trying to use <:< or <%<, be aware that those went away in Scala 2.10.
  * Scala School examples work with Scala 2.9.x . You can use a newer Scala, but expect errors.
  */
class ContainerSecond [A](value: A ) {

//  def addIt(implicit evidence: A =:= Int) = 123 + value

//  암시를 뜻하는 명령어가 <%< 인데 기호가 정상적으로 작동하지 않음 Scala School에서는 2.9 까지 지원하고 그 이상은 지원하지 않음
//  def addIt(implicit evidence: A <%< Int) = 123 + value

}