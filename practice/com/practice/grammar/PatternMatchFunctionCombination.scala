package com.practice.grammar

/**
  * Created by roeuihyun on 2016. 6. 9..
  */
object PatternMatchFunctionCombination {

  def addUmm(x: String) = x + " umm"
  def addAhem(x: String) = x + " ahem"
  val ummThenAhem = addAhem _ compose addUmm _
  val ahemThenUmm = addAhem _ andThen addUmm _

//  val partialing = ummThenAhem orElse ahemThenUmm

  val one: PartialFunction[Int, String] = { case 1 => "one" }
  val two: PartialFunction[Int, String] = { case 2 => "two" }
  val three: PartialFunction[Int, String] = { case 3 => "three" }
  val wildcard: PartialFunction[Int, String] = { case _ => "something else" }
  val partial = one orElse two orElse three orElse wildcard

  case class PhoneExt(name: String, ext: Int)
  val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200))

  def main(args: Array[String]): Unit = {

    // 함수 합성 Function Compose 두번째 함수를 먼저 호출한 다음, 첫번째 함수를 호출한다
    println("---------------------------------------------------------------------------------------------------------")
    println("ummThenAhem(\"Haha\") : " + ummThenAhem("Haha") )

    // andThen도 compose와 비슷하지만, 처음 오는 함수를 먼저 호출한 다음, 두번째 함수를 호출한다
    println("---------------------------------------------------------------------------------------------------------")
    println("ahemThenUmm(\"Haha\") : " + ahemThenUmm("Haha") )

    //isDefinedAt은 PartialFunction에 정의되어 있는 메소드로, 해당 PartialFunction이 주어진 인자를 받을 수 있는지를 알려준다.
    println("---------------------------------------------------------------------------------------------------------")
    println("one.isDefinedAt(1) : " + one.isDefinedAt(1) )
    println("one.isDefinedAt(2) : " + one.isDefinedAt(2) )
    println("partial(5) : " + partial(5) )
    println("partial(3) : " + partial(3) )
    println("partial(2) : " + partial(2) )
    println("partial(1) : " + partial(1) )
    println("partial(0) : " + partial(0) )

    println("---------------------------------------------------------------------------------------------------------")
    println("extensions.filter { case PhoneExt(name, extension) => extension < 200 } : " + extensions.filter { case PhoneExt(name, extension) => extension < 200 } )


  }


}
