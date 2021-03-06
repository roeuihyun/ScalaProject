package com.practice.scalaSchool

/**
  * Map에서 값을 빼올 경우 Option이 return 되는 것을 확인한다.
  * 어떤 것(객체)가 존재하거나 존재하지 않을 수 있을 때, Option을 사용해 처리한다.
  * .map method를 사용하여 반복되는 연산을 피할 수 있다.
  * .foreach는 값을 반환하지 않는다.
  * .filter는 전달된 함수가 거짓을 반환하는 원소들을 제외한 나머지 원소들로 이루어진 리스트를 반환한다.
  * .partition은 조건을 기준으로 내부를 나누는데 tuple을 반환한다. 따라서 나누어진 값을 접근하기 위해선 튜플로 접근해야 한다.
  * _를 함수뒤에 왜 넣는지는 아직도 모르겠다..
  */
object ScalaCollection {

  val mapStructure = Map(("one","1"),("two","2"),("three","3"))
  val numbers = List(1, 2, 3, 4)
  val doubled = numbers.foreach((i: Int) => i * 2)
  val listNumbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  def main(args: Array[String]) {

    println("---------------------------------------------------------------------------------------------------------")
    println("mapStructure : " + mapStructure)
    println("mapStructure.get(\"one\") : " + mapStructure.get("one"))
    println("mapStructure.get(\"four\") : " + mapStructure.get("four"))

    println("---------------------------------------------------------------------------------------------------------")
    println("mapStructure.get(\"one\").isDefined : " + mapStructure.get("one").isDefined)

    println("useDefineMethod(mapStructure.get(\"one\")) : " + useDefineMethod(mapStructure.get("one")))
    println("useDefineMethod(mapStructure.get(\"four\")) : " + useDefineMethod(mapStructure.get("four")))

    println("---------------------------------------------------------------------------------------------------------")
    println("numbers.map((i: Int) => i * 2) : " + numbers.map((i: Int) => i * 2))
    println("numbers.map(timesTwo _) : " + numbers.map(timesTwo _))

    println("---------------------------------------------------------------------------------------------------------")
    println("numbers.foreach((i: Int) => i * 2) : " + numbers.foreach((i: Int) => i * 2))

    println("---------------------------------------------------------------------------------------------------------")
    println("numbers.filter((i: Int) => i % 2 == 0) : " + numbers.filter((i: Int) => i % 2 == 0))
    println("numbers.filter(isEven _) : " + numbers.filter(isEven _))

    println("---------------------------------------------------------------------------------------------------------")
    println("List(1, 2, 3).zip(List(\"a\", \"b\", \"c\")) : " + List(1, 2, 3).zip(List("a", "b", "c")))

    println("---------------------------------------------------------------------------------------------------------")
    println("listNumbers.partition(_ % 2 == 0) : " + listNumbers.partition(_ % 2 == 0) )
    println("listNumbers.partition(_ % 2 == 0)._1 : " + listNumbers.partition(_ % 2 == 0)._1 )

    println("---------------------------------------------------------------------------------------------------------")
    println("listNumbers.find((i: Int) => i > 5) : " + listNumbers.find((i: Int) => i > 5) )
    println("listNumbers.find(i => i > 5) : " + listNumbers.find(i => i > 5) )
    println("listNumbers.find(_ > 5) : " + listNumbers.find(_ > 5) )

    println("---------------------------------------------------------------------------------------------------------")
    println("listNumbers.drop(5) : " + listNumbers.drop(5) )
    println("listNumbers.dropWhile(_ % 2 != 0)  : " + listNumbers.dropWhile(_ % 2 != 0) )

    println("---------------------------------------------------------------------------------------------------------")
    println("listNumbers.foldLeft(0)((m: Int, n: Int) => m + n) : " + listNumbers.foldLeft(0)((m: Int, n: Int) => m + n) )
    println("listNumbers.foldLeft(0)((m , n) => m + n)  : " + listNumbers.foldLeft(0)((m , n) => m + n) )
    println("listNumbers.foldLeft(0)(_ + _)  : " + listNumbers.foldLeft(0)(_ + _) )

    println("listNumbers.foldRight(0)((m: Int, n: Int) => m + n) : " + listNumbers.foldRight(0)((m: Int, n: Int) => m + n) )
    println("listNumbers.foldRight(0)((m , n) => m + n)  : " + listNumbers.foldRight(0)((m , n) => m + n) )
    println("listNumbers.foldRight(0)(_ + _)  : " + listNumbers.foldRight(0)(_ + _) )

    println("---------------------------------------------------------------------------------------------------------")
    val nestedNumbers = List(List(1, 2), List(3, 4))
    println("val nestedNumbers = List(List(1, 2), List(3, 4)) : " + nestedNumbers )
    println("nestedNumbers.flatMap(x => x.map(_ * 2)) : " + nestedNumbers.flatMap(x => x.map(_ * 2)) )

    println("---------------------------------------------------------------------------------------------------------")
    //일반적인 함수 콤비네이터 (아직 잘 모르겠음)
    println("ourMap(numbers, timesTwo(_)) : " + ourMap(numbers, timesTwo(_)) )

    println("---------------------------------------------------------------------------------------------------------")
    val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)
    println("extensions : " + extensions )
    println("extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200) : " + extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200) )
    println("extensions.filter({case (name, extension) => extension < 200}) : " + extensions.filter({case (name, extension) => extension < 200}) )


  }

  def useDefineMethod( param : Option[String] ): Int ={
    if (param.isDefined) {
      return param.get.toInt * 2
    } else {
      return 0
    }
  }

  def timesTwo(i: Int): Int = i * 2

  def isEven(i: Int): Boolean = i % 2 == 0

  def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
    numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
      fn(x) :: xs
    }
  }
}
