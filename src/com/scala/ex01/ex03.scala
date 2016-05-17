package com.scala.ex01

object ex03 {
  val itIsFinal = 0;
  var itIsNotFinal = 0;
  var nums = new Array[Int](10);
  nums = Array[Int](10,20,30,40,50,60,70,80,90,100);
  var nums2 = new Array[Int](10);
  var string = new Array[String](10);
  var index = 0;
  
  def main(args: Array[String]) {
    println("itIsFinal" + itIsFinal);
    println("itIsNotFinal" + itIsNotFinal);
//    itIsFinal = 1; //itIsFinal error
    itIsNotFinal = 1;
    println("itIsNotFinal" + itIsNotFinal);
    
    println("nums배열 출력");
    for(index <- 0 until 10){
      print(nums(index) + "|");
    }
    println("");
    println("배열의 시작이 0인지 1인지 확인(0부터 시작)");
    
    for(index <- 0 until 10){
      nums2(index) = nums(9 - index);
    }
    
    println("nums2배열 출력");
    for(index <- 0 until 10){
      print(nums2(index) + "|");
    }
    
    for(index <- 0 until  10){
      nums2.update(index, nums(index));
    }
    
    println("");
    println("nums2배열 update 함수 사용하여 출력");
    
    for(index <- 0 until 10){
      print(nums2(index) + "|");
    }
    
  }
  
}