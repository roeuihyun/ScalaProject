package com.scala.ex02

object ApplyMethodMain {
  def apply() = new ApplyMethod

  def main(args: Array[String]) {
    val newApplyMethod = ApplyMethodMain()

    println(newApplyMethod)

  }
}