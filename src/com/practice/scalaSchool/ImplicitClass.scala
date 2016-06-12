package com.practice.scalaSchool

/**
  * Created by Administrator on 2016-06-12.
  */
object ImplicitClass {

  implicit def strToInt(x: String) = x.toInt
  val y: Int = "123"

  def main(args: Array[String]) {
    println("---------------------------------------------------------------------------------------------------------")
    println("111 : " + 111)

    println("---------------------------------------------------------------------------------------------------------")
    println("strToInt(\"111\") : " + strToInt("111") )
    println("strToInt(\"111\").getClass : " + strToInt("111").getClass )

    println("---------------------------------------------------------------------------------------------------------")
    println("y : " + y)
    println("y.getClass : " + y.getClass)

    println("---------------------------------------------------------------------------------------------------------")
    println("math.max(\"123\", 111) : " + math.max("123", 111) )
    println("math.max(\"123\", 111).getClass : " + math.max("123", 111).getClass )

    println("---------------------------------------------------------------------------------------------------------")
    //“A <% Int”의 뜻은 A 를 Int 로 “볼 수 있어야만” 한다는 뜻
    println("(new Container[String]).addIt(\"123\") : " + (new Container[String]).addIt("123"))
    println("(new Container[Int]).addIt(\"123\") : " + (new Container[Int]).addIt("123"))
    //could not find implicit value for evidence parameter of type (Float) => Int
    //println("(new Container[Float]).addIt(123.2F) : " + (new Container[Float]).addIt(123.2F))


  }
}
