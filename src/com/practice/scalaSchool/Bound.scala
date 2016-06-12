package com.practice.scalaSchool

/**
  * Created by Administrator on 2016-06-11.
  * 스칼라에서는 다형성 변수를 바운드를 사용해 제약할 수 있다.
  */
object Bound {
//  def cacophony[T](things: Seq[T]) = things map (_.sound) Seq라는 클래스를 모르므로 sound가 되지 않는다.
//  Animal 이  T의 상위 클래스라는 의미 (Animal 에 속하지 않는 클래스는 컴파일시 오류가 난다.)
    def biophony[T <: Animal](things: Seq[T]) = things map (_.sound)

  val flock = List(new Bird, new Bird)
  val addFlock = new Chicken :: flock

  def main(args: Array[String]): Unit = {

    println("biophony(Seq(new Chicken, new Bird)) : " + biophony(Seq(new Chicken, new Bird)))
//    println("biophony(Seq(new Chicken, new Bird)) : " + biophony(Seq(new Chicken, new Bird, new BoundTest)))
    println("flock : " + flock )
    println("addFlock : " + addFlock )

  }

}
