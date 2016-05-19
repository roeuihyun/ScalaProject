package com.practice.grammer

/**
  * 1)Scala에서 함수는 다음과 같이 정의가 가능하며 변수 역시 함수가 될 수 있다.
  * 2)add2 변수(함수)에서의 _(underscore)는 이름이 없는 파라미터 이다.
  * 3)check1()과 check2를 보면 return 타입을 명시해 주지 않아도 스칼라는 리턴 타입을 추론하는 능력을 가졌다.
  * 4)함수를 통해 한번에 여러 변수의 값을 할당할 수도 있다 (일반 객체 지향 언어에 비해 약간 자유롭다.)
	* 5)커리 함수(Curried functions) 함수의 일부만 적용하고 나머지는 나중에 적용하도록 남겨둔다.
	*/
object grammer03 {

	val add2 = {adder(2, _: Int)}

	def adder(m: Int, n: Int) = m + n;

	def check1() = true;
	def check2() : Boolean = return true;

	def defineThreeVal() = ("roeuihyun","hahaha","Hello World!");
	val (first,second,third) = defineThreeVal();

	def multiply(m: Int)(n: Int): Int = m * n;
	def secondeultiply = multiply(2)_;

	def main(args: Array[String]) {

		println("adder(1,2):" + adder(1,2));
		println("add2(5):" + add2(5));
		println("check1():" + check1());
		println("check2():" + check2());
		println("first,second,third: " + first,second,third);
		println("secondeultiply(10):"+secondeultiply(10));

	}
}