package com.scala.ex02

object AddTwoThousand02 {

  def apply(m: Int): Int = m + 2000
  val addTwoThousand = AddTwoThousand02(6000)

  def main(args: Array[String]) {
    print(addTwoThousand);
  }

}