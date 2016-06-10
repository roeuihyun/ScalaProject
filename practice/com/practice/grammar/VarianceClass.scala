package com.practice.grammar

/**
  * Created by roeuihyun on 2016. 6. 10..
  */
class VarianceClass {

  //공변성(covariant)	C[T’]는 C[T]의 하위 클래스이다	[+T]
  //반공변성(contravariant)	C[T]는 C[T’]의 하위 클래스이다	[-T]
  //무공변성(invariant)	C[T]와 C[T’]는 아무 관계가 없다	[T]
  class Covariant[+A] // 공변성
  class Contravariant[-A] // 반공변성

  class Animal { val sound = "rustle" }
  class Bird extends Animal { override val sound = "call" }

  def main(args: Array[String]): Unit = {

    println("---------------------------------------------------------------------------------------------------------")
    val cv: Covariant[AnyRef] = new Covariant[String]
    println("cv : " + cv )

    //    val cv2: Covariant[String] = new Covariant[AnyRef]
    //    println("cv2 : " + cv2 )

    println("---------------------------------------------------------------------------------------------------------")
    //    val cv3: Contravariant[AnyRef] = new Contravariant[String]
    //    println("cv3 : " + cv3 )

    val cv4: Contravariant[String] = new Contravariant[AnyRef]
    println("cv4 : " + cv4 )



  }



}
