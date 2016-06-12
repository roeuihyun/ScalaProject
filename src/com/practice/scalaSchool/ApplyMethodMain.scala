package com.practice.scalaSchool

object ApplyMethodMain {
  def apply() = new ApplyMethod

  def main(args: Array[String]) {
    val newApplyMethod = ApplyMethodMain()

    println(newApplyMethod)

  }
}