package com.practice.grammar
import scala._
/**
  * Scala의 기본 변수를 사용한 연산을 확인해 본다.
  * 기본적으로 형을 지키지 않는듯 하나 형을 지키는 것을 확인할 수 있었으며 형변환은 자바의 Integer Class를 사용한 명시적 형변환도 가능하다.
  * Unit은 인자를 받지 않고 아무 것도 돌려주지 않는 모든 함수를 뜻한다.
  * 아래의 예제에서는 콜백함수가 아무것도 돌려주지 않는 모든 함수란 뜻 이다.
 */
object grammar02 {
  
	val number01 = 1;
	val number02 = 2;
	var number03 = "0";
	var number04 = 0;
	var number05 = 0;
	
	def addNumberTypeSafe(){
	  number04 = number01 + number02;
	}
	
	def addNumberNotTypeSafe(){
//	  number03 = number01 + number02;
//	  typemismatch error
	  number03 = Integer.toString(number01 + number02);
	}
	
	def minusNumberTypeSafe(){
	  number05 = number02 - number01;
	}
	
	
	def useCallBack(callBackFunctionName: () => Unit){
	  
	  return callBackFunctionName(); 
	}
	
  def main(args: Array[String]) {
    
    println("init Value-------------------------------------");
	  println("number01:" + number01);
	  println("number02:" + number02);
	  println("number03:" + number03);
	  println("number04:" + number04);
	  println("number05:" + number05);
	  println("-----------------------------------------------");
	  
	  addNumberTypeSafe();
	  
    println("addNumberTypeSafe method ----------------------");
	  println("number01:" + number01);
	  println("number02:" + number02);
	  println("number03:" + number03);
	  println("number04:" + number04);
	  println("number05:" + number05);
	  println("-----------------------------------------------");
	  
	  addNumberNotTypeSafe();
	  
    println("addNumberNotTypeSafe method -------------------");
	  println("number01:" + number01);
	  println("number02:" + number02);
	  println("number03:" + number03);
	  println("number04:" + number04);
	  println("number05:" + number05);
	  println("-----------------------------------------------");	
	  
	  useCallBack(minusNumberTypeSafe);
	  
    println("useCallBack method ----------------------------");
	  println("number01:" + number01);
	  println("number02:" + number02);
	  println("number03:" + number03);
	  println("number04:" + number04);
	  println("number05:" + number05);
	  println("useCallBack(minusNumberTypeSafe):" + useCallBack(minusNumberTypeSafe));
	  println("-----------------------------------------------");
	  
  }
  
}