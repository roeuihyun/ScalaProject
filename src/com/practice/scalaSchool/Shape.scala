package com.practice.scalaSchool

/**
	* abstract은 메소드 정의는 있지만 구현은 없는 클래스이다. 대신 이를 상속한 하위클래스에서 메소드를 구현하게 된다. 추상 클래스의 인스턴스를 만들 수는 없다.


	*/
abstract class Shape {

	def getArea():Double    // 하위클래스에서 이 메소드를 정의해야만 한다

}