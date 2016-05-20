package com.practice.grammar

/**
	* 1)grammer04라는 클래스를 만들고 정의한다
	* 2)grammer05에서 apply함수를 통해 다음과 같이 표현하여 메소드를 호출하듯 객체 인스턴스를 호출할 수 있다.
	*/
import java.text.SimpleDateFormat
import java.util.Calendar

object grammar05 {

	def apply() = new grammar04();

	val applyTest = grammar05();

	val now = Calendar.getInstance().getTime();

	def currentTime(): Unit ={
		val minuteFormat = new SimpleDateFormat("mm");
		println(minuteFormat.format(now));
	}

	def main(args: Array[String]) {

		println(applyTest);

	}

}