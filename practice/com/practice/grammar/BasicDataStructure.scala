package com.practice.grammar

/**
	*
	*/
object BasicDataStructure{

	var numbersList = List(2, 3, 4, 5)
	var numbersSet = Set(1, 1, 2)
	var stringTuple = ("localhost", "8080")

	def main(args: Array[String]) {

		println("List------------------------------------------------------------------------------------")
		println("numbersList : " + numbersList)
		println("numbersList Find Index Value1 : " + numbersList.seq(1))
		println("numbersList Find Index Value2 : " + numbersList.apply(1))
		numbersList = numbersList :+ 6
		println("numbersList Add Value : " + numbersList)
		numbersList = numbersList.updated(4,7)
		println("numbersList Update Value : " + numbersList)
		numbersList = numbersList.patch(4, Nil, 1)
		println("numbersList Remove Value : " + numbersList)
		println("List------------------------------------------------------------------------------------")
		println("Set------------------------------------------------------------------------------------")
		println("numbersSet : " + numbersSet)
		println("numbersSet.seq(1) : " + numbersSet.seq(2))
		println("Set------------------------------------------------------------------------------------")
		println("------------------------------------------------------------------------------------")
		println("stringTuple : " + stringTuple)
		println("stringTuple._1 : " + stringTuple._1)

	}

}