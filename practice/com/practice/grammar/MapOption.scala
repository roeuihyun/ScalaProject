package com.practice.grammar

/**
  * Map에서 값을 빼올 경우 Option이 return 되는 것을 확인한다.
  * 어떤 것(객체)가 존재하거나 존재하지 않을 수 있을 때, Option을 사용해 처리한다.
  */
object MapOption {

  var mapStructure = Map(("one","1"),("two","2"),("three","3"))

  def main(args: Array[String]): Unit = {

    println("mapStructure : " + mapStructure)
    println("mapStructure.get(\"one\") : " + mapStructure.get("one"))
    println("mapStructure.get(\"four\") : " + mapStructure.get("four"))

    println("mapStructure.get(\"one\").isDefined : " + mapStructure.get("one").isDefined)

    println("useDefineMethod(mapStructure.get(\"one\")) : " + useDefineMethod(mapStructure.get("one")))
    println("useDefineMethod(mapStructure.get(\"four\")) : " + useDefineMethod(mapStructure.get("four")))

  }

  def useDefineMethod( param : Option[String] ): Int ={
    if (param.isDefined) {
      return param.get.toInt * 2
    } else {
      return 0
    }
  }


}
