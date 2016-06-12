package com.practice.scalaSchool

/**
  * Created by roeuihyun on 2016. 5. 24..
  */
class Calculator(brand: String) {
  /**
    * 생성자
    */
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  // 인스턴스 메소드
  def add(m: Int, n: Int): Int = m + n

  var acc = 0;
  def minc = {acc += 1}
  val finc = {() => acc += 1}
}
