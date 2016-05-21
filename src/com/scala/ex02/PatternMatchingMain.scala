package com.scala.ex02

import java.util.Scanner

object PatternMatchingMain {

  def main(args: Array[String]) {

    println(PatternMatching.times1);
    println(PatternMatching.times2);
    println(PatternMatching.times3(new Scanner(System.in).nextLine()));

  }

}