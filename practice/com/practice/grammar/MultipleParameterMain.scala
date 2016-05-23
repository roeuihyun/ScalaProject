package com.practice.grammar

/**
	*
	*/
object MultipleParameterMain {

	def apply() = new MultipleParameter();
	val MultipleParameter = MultipleParameterMain();

	def main(args: Array[String]) {
		print(MultipleParameter.capitalizeAll("rarity", "applejack"))
	}

}