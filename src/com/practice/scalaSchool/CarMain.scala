package com.practice.scalaSchool

/**
	* Car trait과 Shiny trait을 구현한 클래스
	*/
object CarMain extends Car with Shiny{

	val brand = "BMW"
	val shineRefraction = 1944

	def main(args: Array[String]) {
		println(brand)
		println(shineRefraction)
	}

}