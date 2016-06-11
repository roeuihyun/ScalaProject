package com.practice.scalaSchool
/**
  * Scala의 기본 변수 선언시 val와 var의 차이점을 확인한다.
 */
object Variable {
  
	val immutableValue = "immutableValue";
	var mutableValue = "mutalbeValue";
	
  def main(args: Array[String]) {
	  
	  println(immutableValue);
	  println(mutableValue);
	  
//  if(immutableValue != null)immutableValue = null
//  cannot reassignment 
	  if(mutableValue != null)mutableValue = null
	  
	  println(immutableValue);
	  println(mutableValue);
	  
  }
  
}