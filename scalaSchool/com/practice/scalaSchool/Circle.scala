package com.practice.scalaSchool

/**
	* abstract을 구현한 클래스의 예제이다
	*/
class Circle(r:Double) extends Shape{

	def getArea():Double  = { r * r * 3.14 }

}