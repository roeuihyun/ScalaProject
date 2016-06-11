package com.practice.scalaSchool

/**
	* abstract을 구현한 클래스의 메인이다
	*/
object CircleMain{

	def main(args: Array[String]) {
		val newCircle = new Circle(3);

		println(newCircle.getArea());

	}

}