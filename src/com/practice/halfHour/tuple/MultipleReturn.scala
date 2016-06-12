package com.practice.halfHour.tuple

/**
  * Created by Administrator on 2016-06-12.
  */
object MultipleReturn {

  def swap(x:String, y:String) = (y, x)
  def swap2 = (x:String, y:String) => (y, x)
  def swap3 = (x:Any , y:Any) => (y, x)
  var (x, y, z, g, python, java) = (1, 2, 3, true, false, "no!")

  def main(args: Array[String]): Unit = {

    val (a,b) = swap("hello","world")
    val (c,d) = swap2("hello","world")
    val (e,f) = swap3("hello","world")
    print("swap(\"hello\",\"world\") : ")
    println(a, b)
    print("swap2(\"hello\",\"world\") : ")
    println(c, d)
    print("swap3(\"hello\",\"world\") : ")
    println(e, f)
    print("(x, y, z, g, python, java) = (1, 2, 3, true, false, \"no!\") : ")
    println(x, y, z, g, python, java)

  }

}
